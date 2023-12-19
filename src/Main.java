public class Main {
    public static void main(String[] args) {
        lab_07.hooo();

    }

    class lab_07{
        public static void hooo() {
            set<String> set01 = new set<>();
            set<String> set02 = new set<>();
            set<String> set03 = new set<>();
            set01.add("Java");
            set01.add("Python");
            set01.add("C++");

            set02.add("C#");
            set02.add("JavaScript");

            set03.add("C#");
            set03.add("Java");

            System.out.println("Set01 size: " + set01.size());
            System.out.println("Set01 contains Java: " + set01.contains("Java"));
            System.out.println("Set01 contains C#: " + set01.contains("C#"));

            System.out.print("Set01 elements ");
            printset(set01);

            System.out.print("Set02 elements ");
            printset(set02);

            System.out.print("Set03 elements ");
            printset(set03);

            set01.addAll(set02);
            System.out.print("Set01 elements after addAll Set02: ");
            printset(set01);

            set01.retainAll(set03);
            System.out.print("Set01 elements after addAll and retainAll Set03: ");
            printset(set01);

            System.out.println(set01.containsAll(set03));
            set01.clear();
            System.out.print("set01 clear");
            printset(set01);
            System.out.println(set01.isEmpty());
            System.out.println();
        }

        private static void printset(set<String> set){
            for (String element : set) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }




}