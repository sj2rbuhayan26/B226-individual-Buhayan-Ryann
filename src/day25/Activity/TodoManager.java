/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.Activity;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 03
 */
public class TodoManager {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        clearScreen();
        Menu();

    }

    public static void Menu() {
        System.out.println("=============================");
        System.out.println("Conditional To‑Do List Manager");
        System.out.println("=============================");

        System.out.println(" [1] Add a Task");
        System.out.println(" [2] View All Tasks");
        System.out.println(" [3] Update Task");
        System.out.println(" [4] Remove Task");
        System.out.println(" [5] Clear All Task");
        System.out.println(" [6] Exit");
        System.out.print("Select Option : ");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println("Add a task");
                add();
                Menu();
                break;
            case 2:
                System.out.println("View All Tasks");
                view();
                Menu();
                break;
            case 3:
                System.out.println("Update Task");
                update();
                Menu();
                break;
            case 4:
                System.out.println("Remove Task");
                removeTask();
                Menu();
                break;
            case 5:
                System.out.println("Clear All Task");
                clearAll();
                Menu();
                break;
            case 6:
                System.out.println("Exiting...");
                break;
        }

    }

    public static void add() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");

    }

    public static void view() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void update() {
        view();
        System.out.print("Enter task index to update: ");
        int index = scanner.nextInt()-1;
        scanner.nextLine();

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter new task: ");
            String newTask = scanner.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void removeTask() {
        view();
        System.out.println("Enter task index to remove : ");
        int index = scanner.nextInt()-1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully...");
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void clearAll() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to clear.");
        } else {
            tasks.clear();  
            System.out.println("All tasks have been cleared.");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
