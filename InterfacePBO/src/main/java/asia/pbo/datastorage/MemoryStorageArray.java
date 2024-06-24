/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.pbo.datastorage;

import java.util.ArrayList;

/**
 *
 * @author A-10
 */
public class MemoryStorageArray implements DataStorage {
    private ArrayList<String> data;

    @Override
    public void writeData(String data) {
        this.data.add(data);
    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        for (String item : this.data) {
            sb.append(item);
        }
        return sb.toString();
    }    
}
