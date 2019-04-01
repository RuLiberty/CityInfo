package ru.geekbrains.cityinfo;

import java.util.ArrayList;
import java.util.List;

// Обработчик подписок
public class Publisher {

    private List<CitiesFragment.Observer> observers;   // Все обозреватели

    public Publisher() {
        observers = new ArrayList<>();
    }

    // Подписать
    public void subscribe(CitiesFragment.Observer observer) {
        observers.add(observer);
    }

    // Отписать
    public void unsubscribe(CitiesFragment.Observer observer) {
        observers.remove(observer);
    }

    public void unsubscribeAll() {
        observers.clear();
    }

    // Разослать событие
    public void notify(String text) {
        for (CitiesFragment.Observer observer : observers) {
            observer.onUpdate(text);
        }
    }
}

