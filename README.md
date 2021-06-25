# IoC-CDI-AOP
IoC, CDI, inversion, @ Named, @ Produces, @ Inject, @ RequestScoped ,@ Alternative,  @ ConversationScoped, @ SessionScoped @ ApplicationScoped,  @ Dependent, @ Default, Qualifier, @ MyCombinedBinding, Interceptor, Multiple Interceptor,@ Decorator,@ MyEventQualifier, Event&lt;>, Qualifier Literal

Önder Teker - Spring Eğitiminden Çıkardığım Notlar :

1- http://download.jboss.org/jbosstools/photon/stable/updates/

2- CDI (Context and Dependency Injection)


3- Bean olmasının koşulu Getter & Setter
4- CDI'da bean olması için @Named anatasyonu classa uygulanır.
	

5- SET & GETi olan her şey bir property olarak kabul edilir. field olmasınada gerek oyk.

6- CDI bir rol vermez. Nesne başka yerde kullanılabilir.
7- @RequestScoped ->Her istendiğinde yeniden yarat

8-@Named("selam")   -> 
jsf sayfası içinde çağrımı artık selam şeklinde olucak, Yani sınıf ismi olmayacak. 
Artık selam.myProperty şeklinde çağrılcak.

9- @Produces ->  varsa bir şeyinde, Ben üretirim demektir. (metodun üstünde)
   @Inject -> Ben bunu tükerim ve ekrana basarım diyor. (fieldın üstüne koy)

**Consumer'i yapan kişi, Producerin kim olduğunu dahi bilmiyor.
Yani Üreten, Tüketiciyi tanımıyor. (Bir otel gibi, Çalışanlar değişse, otelde olan bitenden umursamıyoruz)



10- @New -> Yine birşey üretiliyor Fakat Başkası tarafından kullanılmıyor.Üretici (Produces) Tarafından 
Kulanılıyor.
(Siz bir Üreticiye gidiyorsunuz. Ondan bir şey istiyorsunuz, Üretici diyorki banada bu lazım.
Git banada bunu getir şeklinde)


**Açıklaması : 1) Consumera  Inject edilicek, ortamdan istiyor.
	       2) Producer'da Bunu veriyor fakat buda parametre alıyor. istiyor
	       3) Consumerda @New ile instance yaratıyor veriyor.
Yapılma sebebi ise olabildiğince birbirinden koparalım diye. 
Produceri ->Consumerden kopardı, üstelik parametreyide git bana başka yerden getir dedi.




11- get ile yazılan her şey bir property sayılır. Ondan sonrası property sayılır.
örn://getMyProperty


12- setterInjection ->Veri tabanından birşeyler yükleyeceksek bu daha mantıklı oluyor.



13- Bean olabilimesi için boş bir constructor olması lazım.

14- scope -> Bir nesne yaratıldıktan sonra ne kadar yaşayacak
@RequestScoped -> Her istekte, tekrar yaratılır

SessionScoped -> Bir kez yarattıktan sonra, Belli bir kullanıcı yada belli bir kullanım için tekrar yaratma
ApplicationScoped -> Bütün kullanıcılar için, Bütün uygulamalar için  tek bir tane yarat. Browserdan browsera
aynı bütün kullanıcılar içinde böyle.



**Not -> ApplicationScoped => Kategoriler örneği. Bütün kullanıcılar için aynı.  Aynı kategoriyi tekrar, tekrar yüklememek için onları burda yapıyoruz.
				Bir kez yaratıp, bir daha tekrar tekrar istememek.
	RequestScoped => Her istekte değişik bir ürün göstermek istiyorsanız.
	SessionScopde => Kullanıcı sepeti gibi. Sayfalarda gezinirken Aynı sepeti görmek için bu kullanılır.




15- Dependent Beanler ( Bağımlı Beanler)  ->Hangi Bean içindeysen, Onun kapsamı ne ise ona uy. Kendine has bir scope'ta olma.
Bazen nesne nerde yaratılıyorsa, oraya uyum sağmalası gerekiyor. Bunada dependent deniyor.
@Dependent -> Bunun kendine has bir scopu yok. Session Scope'tan çağrılıyorsa, session scope. RequestScope'tan çağırıyorsa onun gibi davransın.

16- RequestScoped -> Her istekte Yeniden yarat.
    SessionScoped -> Bir kullanıcının Sitedeki işlemleri boyunca yaşa demek.

    ConversationScoped	-> Bazı işlemler 1 istekte bitmiyor. Biraz daha uzun  5,10 istek gerektiriyor ve bütün oturum boyunca sürmüyor, belli bir süre sorna bitiyorsa
			örn// Parayı ödeme aşaması (ConversationScoped zorunlu kılıyor)
			-> Ne zaman başlayacağını, Ne zaman bitceğini geliştirici belirlemek durumunda.
			-> 3 tane işlem vardır. başlangıç, sürdürme, bitirme.


___________________________________________ OOOOOOO______________________________________________________

 IoC(Inversion Of Control) ->  1) Interface yapılıyor ve gövdesiz metod konuyor.
				2) Onu Gerçekleştiren bir class var
				3) Biz interfaceye inject dedik, sonra o interface sistemde tarandı (Yapan CDI, JBOSS için Weld)

*Not ->Denetim interfaceyi  kullanana geçer. Denetim Gerçekleştirende değil, onu kullananda.


* Bu interfaceyi implement eden,gerçekleştirin sınıfı git bul.

**Not -> Injection demek -> Onların getirip, bize vermesi.
**Not -> Inversion Of Control da ise ->Hem ne istediğimizi söylüyoruz(Kontrol bizde). Hemde diyoruzki
sen getir inject et, bırak.
IoC&DI -> Bir araya gelmesi ile  birbirinden kopuk, belli bir standartta anlaşmış nesneler oluyor.
Bütün sistemi parçalara bölüp, birbirini tanımayan bileşenler yapıyorlar.


SORU -> birden fazla İmplementasyon varsa nolur?
ÇÖZÜM 1: -> 1) implement yapan sınıfların başına @Alternative anatasyonu uyglanır.
	   2) WEB-INF -> beans.xml ->   <alternatives>
        				<class>com.godoro.cditest.alternative.MyChoiceImplyOne</class>
        			</alternatives>
bunu ekle.


ÇÖZÜM 2:   @Default    -> Varsayılan implementasyon bu ve çalışılcak olan bu.
	   @Bizim_Anatasyonumuz -> Bunu kullanan varsa Bu implemantasyon çalışcak.
Not: eğerki Bean içinde @Inject @Bizim_Anatasyonumuz varsa, bu default olanı seçmemiş, diğerini çalıştır demek.

1 tane default olabilir ve birden fazlada option olabilir.

Not2 : @Bizim_Anatasyonumuz olan yerde Enum tanımlarsak ve value(); dersek. ona tip vermiş oluruz
____________________________________________ OOOOOOOOOOOOOOOO______________________

1- AOP : Bir nesneyle onu çağıran nesnenin arasına girmek.
Neden yapılıyor ?:	Bütün sınıfların loglanması lazım veya Güvenlik koyulması lazım gibi.
Sadece 1 özelliğini bir yere koyuyoruz.

not -> @Inject demek -> Bu classı git bul getir. new'le
interceptor ->araya girmedir.
new -> Other -> CDI ->Interceptopr of Binding tıkla  ->isim ver 


@MyTraceBinding	  //Herhangi bir nesne bu anatasyonla işaretlenirse, Ben onun yolunu KESERİM demektir
@Interceptor
public class MyTraceInterceptor{}


2- interceptor'lar -> Varsayılan olarak etkin olmazlar. Bizim onu etkinleştirmemiz lazım. bunun içinde :
src -> webapp->web-inf-> beans.xml :
	 <interceptors>
        	<class>com.godoro.cditest.interceptor.MyTraceInterceptor</class>
        </interceptors>   


Amaç : 2 nesneyi birbirinden koparmak, araya 3. nesne koymak

3- Aynı binding'e parametre ile 2 tane interceptor ekleyebilirsin.

4- @MyCountBinding ( ascending = false) -> ascending'i false olan devreye girer, demektir.

**Not -> beans.xml'de interceptor'ları işaretlemezsen çalışmazlar.

5- Aynı anda birden fazla interceptor kullanılabilir mi?
Evet ve bir class, hem loglama, hem güvenlikle ilgili bir şey yapabilir.
1.yolu // şeklinde class üzerinde 
@MyTraceBinding
@MyCountBinding( ascending =  true)


6- interceptor'lar pek iş mantığına girmezler. GÜvenlink, loglama, Genel Aspec olaylara bakıyorlar


7- Decorator-> Yol kesme becerisi yok. Araya girer.
*Decorator'da IoC gibi çalışır. Interface var, onun implementasyonu var.
*Decorator sınıfıda o baş interface'yi de implemente eder.
*implements olandan -> tüm metotlarını @Override etmezsek, o class'ı abstract yapmalı.

örn// Decarator kullanımı.

@Decorator
abstract public class MyActualDecorator implements MyActualSpec {

	private @Inject @Delegate MyActualSpec myActualSpec;
			.................


**client decoratoru çağırıyor, decorator'da hedefteki asıl implementasyonu çağırıyor.
*proceed yapmıyoruz burda.

** Decorator iki yönlü ok gibi düşün. 
örn// Eve girer ufak değişiklik yapar, çıkar. Yine Ev, ev olarak kalmış olur. 


** beans.xml'de tanıtmak gerekir.
<decorator>
	<class>com.godoro.cditest.decorator.MyActualDecorator</class>
</decorators>

___________________________

8- Stereotype ->Bütün anatasyonları tek bir anatasyon şeklinde yaz.
@Model anatasyonu -> @Named ve @RequestScoped yazmak yerine bizi bunlardan kurtarıtırıyor.
tek bir @Model anatasyonu ile bunları yazmış oluyoruz.


__________________

9-Event -> @Observes: daha önce produces'un tersi. 
@Observers ->Bir olay gerçekleşince, biz bunu gözlemleriz. 
Olayı haber vericek, ateşleyecek sınıf ise Bean.


@Observes ->Tepki verendir. Yani biri olay üretiyor, Buda tepki veriyor. Birbirinden bağımsız.

@Observes @MyEventQualifier(level=2)  -> Ben dinliyorum olayı ama, sadece düzey 2 olaylarını 
dinliyorum.
