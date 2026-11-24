package Encapsulation;

public class SetGet {

        private String name;
        private int age;
        private String className;

        // Setter for name
        public void setName(String name) {
            if (this.name == null) {
               this.name = name;
            } else {
                this.name = this.name + " " + name;
            }
        }
        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for age
        public void setAge(int age) {
            if (age >= 100) {
                this.age = age;
            }else{
                this.age = age;
            }
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        public void setClassName(String className) {
            if (this.className == null) {
                this.className = className;
            }
        }
        public String getClassName() {
            return className;
        }
    }
