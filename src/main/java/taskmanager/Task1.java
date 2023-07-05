package taskmanager;

class Task1 {
    private String title;
    private String description;
    private String dueDate;
    private int priority;
    private String status;
    public Task1(String title, String description, String dueDate, int priority) { //создали конструктор для того,
                                                                            // чтобы он принял занчение полей объекта
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = "выполнено";
    }
    public void setTitle(String title) { //получить доступ к полям

        this.title = title;
    }
    public void setDescription(String description) {

        this.description = description;
    }
    public void setDueDate(String dueDate) {

        this.dueDate = dueDate;
    }
    public void setPriority(int priority) {

        this.priority = priority;
    }
    public void setStatus(String status) {

        this.status = status;
    }
    @Override
    public String toString() { //переопределенный метод для вывода информации о задаче в виде строки
        return   "Название: " + title +
                "\nОписание: " + description +
                "\nДата выполнения: " + dueDate +
                "\nПриоритет: " + priority +
                "\nСтатус: " + status +
                "\n";
    }
}

