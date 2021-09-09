package _case_study.service;

import java.util.List;

public interface FuramaService<E> {
     void addList(String path);
     void displayList(String path);
     void editList(String path);
     List<E> returnList(String path);
     void deleteList(String path);

}
