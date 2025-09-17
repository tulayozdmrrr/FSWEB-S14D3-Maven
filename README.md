# Vehicle Polymorphism Project

Bu proje, Java'da **polymorphism** ve **inheritance** konularını uygulamak için hazırlanmıştır.  

## Sınıflar

- **Car**: Base sınıf, startEngine, accelerate ve brake metodlarına sahiptir.  
- **ElectricCar**: Car sınıfından türemiş, batarya özellikleri ve km başına şarj kapasitesine sahip.  
- **HybridCar**: Car sınıfından türemiş, hem batarya hem de yakıt özellikleri ile çalışır.  

## Özellikler

- Tüm sınıflarda `startEngine`, `accelerate`, `brake` metodları **override** edilmiştir.  
- `Main` sınıfı, polymorphism kullanarak her sınıfın davranışlarını test eder.  
- Konsola sınıf türü ve motor hareketleri yazdırılır.  

## Kullanım

Projeyi çalıştırmak için:  

```bash
git clone <repo-url>
cd <proje-klasörü>
javac -d out src/main/java/org/example/company/*.java
java -cp out org.example.company.Main
