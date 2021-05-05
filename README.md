# Animasyon İşlemleri

## İçerik

1. Kullanılan Teknojiler
2. Proje Tanımı

## Kullanılan Teknolojiler

  + Android Studio

![Image of Android Studio](https://www.xda-developers.com/files/2017/04/android-studio-logo.png)

  + Java

![Image of Java](https://yazilimamelesi.files.wordpress.com/2013/03/java_logo.jpg)


## Proje Tanımı

Android uygulamalarında kullanılan animasyon işlemleri kullanılarak geliştirilmiş bir örnek projedir.

![Image of Android Studio](https://lh3.googleusercontent.com/proxy/LVpV42NxM_jeKb3-hb6IpWic0gH97s-mIe2reqx-BOxxMifI6rMDJOYWwSQMCDe9zP002AIAqTeE9nDmkE2WBYU1_I0ssYsaKIpxHfapGuwgTpA9pSoC)

Animasyonlar, uygulamaları görsel olarak daha şık ve hoş bir görünüme kavuştururlar. Çok çeşitli animasyonlar yapabiliriz. Bu projede basit örnekler ile android elementleri üzerinde nasıl animasyonlar yapabileceğimize dair küçük bir örnek yaptım.

1. İlk olarak uygulamamız dizininde `res\anim` klasörü oluşturuyoruz.

![Adsız](https://user-images.githubusercontent.com/37263322/117142991-00dd7300-adb9-11eb-87bf-7e0003443b1c.png)

2. Oluşturmak istediğimiz her farklı animasyon için `anim` klasörü içerisine **.xml** uzantılı olan `Animation Resource File` oluşturuyoruz.

![1](https://user-images.githubusercontent.com/37263322/117143339-6467a080-adb9-11eb-9e40-494a8151af28.PNG)

3. Animasyonlar için xml kodları yazalım.
  
### **Animasyon Tag**larını tanıyalım.

| Tag | İşlevi |
|    :---:     |     :---       |
| **Translate** | Nesnelerin **X** ve **Y** koordinatları üzerinde hareket etmesini sağlar. |
| **Alpha** | Nesnelerin opaklığını değiştirir. |
| **Rotate** | Nesneleri döndürür. |
| **Scale** | Nesnelerin boyutunu değiştirir. |

### Animasyon taglarının özellikleri

| Özellik | İşlevi |
|    :---:     |     :---       |
| **duration** | Animasyonun süresi. |
| **pivotX** | Görsel nesnelerin şekilsel işlemlerde **X** merkezini belirlemek için kullanılır. |
| **pivotY** | Görsel nesnelerin şekilsel işlemlerde **Y** merkezini belirlemek için kullanılır. |
| **fillAfter** | Animasyon gerçekleştikten sonra önceki durumuna dönüp dönmeyeceğini belirtir. |
| **%** | Oranlama birimidir. Cismin boyutu 100% olarak kabul edilir ve animasyon cismin boyutuna göre yapılandırılabilinir. |
| **%p** | Ekran boyutu 100% olarak kabul edilir ve animasyon ekran boyutuna göre yapılandırılabilinir. |
| **repeatMode** | Animasyonların tekrarlama şeklini belirler. **_restart_** yapılan işlemin son haline geldikten sonra başa dönerek işlemi tekrarlama. **_reverse_** yapılan işlemin son haline geldikten sonra geriye doğru işlem yapma şeklinde tekrarlama. |
| **repeatCount** | Animasyonların tekrarlama sayısını belirler. |

![2](https://user-images.githubusercontent.com/37263322/117147917-62eca700-adbe-11eb-96bd-4ea9f0f4d18e.PNG)

4. Şimdi Java kısmına geçebiliriz.
  
### Gerekli kütüphanlerimizi ekleyelim.
      
```import android.view.animation.Animation;```

```import android.view.animation.AnimationUtils;```
       
### Animasyon nesnesi oluşturalım.
    
```Animation animation = AnimationUtils.loadAnimation(this, R.anim.ardisikcalismasi);```

### Bir **Button** üzerinde animasyonu aktif hale getirelim.

```button.startAnimation(animation);```

| Metot| İşlevi |
|    :---:     |     :---       |
| **SetAnimation** | Sayfa yüklendikten sonra çalışır. |
| **StartAnimation** | Hızlı bir şekilde çalışmasını istiyorsak sayfa yüklenmesi önemsiz ise örneğin butona basılınca çalıştırma durumlarında çalışır. |
