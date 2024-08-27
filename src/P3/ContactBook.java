package P3;

import java.util.ArrayList;
import java.util.List;

public class ContactBook <T extends Contact>{
    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void printList() {
        // Выведите на экран весь список контактов книги
        for (Contact contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false;//проверяем есть ли контакт в базе
        for (Contact contact : contacts)
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        if (contact.getName().equals(name)) {
            System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
            contact.sendMessage();
        } else
            System.out.println("Не найден контакт с указанным именем.");

        // Если контакт не найден, выведите соответсвующее сообщение

    }




}
