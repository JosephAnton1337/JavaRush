package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
 Метод handleExceptions должен вызывать метод BEAN.methodThrowExceptions.
2. Метод handleExceptions должен логировать исключение FileSystemException (вызвать метод BEAN.log), а затем пробросить его дальше.
3. Метод handleExceptions должен только логировать (вызвать метод BEAN.log) исключение CharConversionException.
4. Метод handleExceptions должен только логировать любое исключение IOException.
5. Добавь в объявление метода handleExceptions класс исключения FileSystemException.
6. Метод main должен использовать try..catch.
7. Метод main должен логировать исключения, которые кидает метод handleExceptions.
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws CharConversionException, FileSystemException,IOException {

try {

    handleExceptions();
}
catch (FileSystemException e){
    BEAN.log(e);

}
            //BEAN.log(IOException e);


    }

    public static void handleExceptions() throws FileSystemException {

        try {
            BEAN.methodThrowExceptions();
        }
        catch (FileSystemException e){
            BEAN.log(e);
            throw e;
        }
        catch (IOException e){
            BEAN.log(e);
        }


    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
