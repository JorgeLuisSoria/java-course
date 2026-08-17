package com.devtalles.exception.autocloseable;

public class FakeDataBaseConnection implements AutoCloseable{

    public FakeDataBaseConnection() {
        System.out.println("Connection to the Database executed");
    }

    public void fetchData() {
        System.out.println("Fetching data from the Database executed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing FakeDataBaseConnection");
    }

}
