class Park {
    public class Attraction {
        private String name;
        private String timeOfWork;
        private double cost;

        public Attraction(String name, String timeOfWork, double cost) {
            this.name = name;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }

        public void displayAttractionInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Time of Work: " + timeOfWork);
            System.out.println("Cost: " + cost);
        }
    }

        public static void main(String[] args) {
            Park park = new Park();
            Attraction attraction1 = park.new Attraction("Free fall ride", "10:00 - 18:00", 10.0);
            attraction1.displayAttractionInfo();

            Attraction attraction2 = park.new Attraction("Ferris wheel", "11:00 - 19:00", 5.0);
            attraction2.displayAttractionInfo();
        }
    }
