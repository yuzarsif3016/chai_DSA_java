public class Employee  implements Comparable<Employee>{
    public int id;
    public String name;
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}