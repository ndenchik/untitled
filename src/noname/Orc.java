package noname;

public class Orc {

    public class Orc {

        private String name = "NameLess";
        private int force;
        private int health;

        public Orc(int force, int health) {
            this.force = force;
            this.setHealth(health);
        }

        public Orc(String name, int force, int health) {
            this(force, health);
            this.name = name;
        }

        public void attack(Orc o){
            o.health -= this.force;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getForce() {
            return force;
        }

        public void setForce(int force) {
            this.force = force;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health > 100 ? 100 : health;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Orc{");
            sb.append("name='").append(name).append('\'');
            sb.append(", force=").append(force);
            sb.append(", health=").append(health);
            sb.append('}');
            return sb.toString();
        }
    }
}
