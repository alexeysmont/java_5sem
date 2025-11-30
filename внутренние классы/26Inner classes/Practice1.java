public class Practice1 {
    public class PublicInner {}      // доступен везде
    private class PrivateInner {}    // только в Practice1
    protected class ProtectedInner {} // в Practice1 и подклассах
    class PackageInner {}            // только в пакете
    
    public static void main(String[] args) {
        Practice1 outer = new Practice1();
        PublicInner pub = outer.new PublicInner(); // доступен
        PrivateInner priv = outer.new PrivateInner(); // доступен (в том же классе)
        ProtectedInner prot = outer.new ProtectedInner(); // доступен
        PackageInner pack = outer.new PackageInner(); // доступен
    }
}

class OtherClass {
    void test() {
        Practice1 outer = new Practice1();
        Practice1.PublicInner pub = outer.new PublicInner(); // доступен
        // Practice1.PrivateInner priv = outer.new PrivateInner(); // недоступен
        // Practice1.ProtectedInner prot = outer.new ProtectedInner(); // недоступен (не подкласс)
        // Practice1.PackageInner pack = outer.new PackageInner(); // если в том же пакете
    }
}