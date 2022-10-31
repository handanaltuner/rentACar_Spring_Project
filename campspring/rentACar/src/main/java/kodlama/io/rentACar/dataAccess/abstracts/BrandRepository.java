package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;



import kodlama.io.rentACar.entities.concretes.Brand;


public interface BrandRepository { //veritabanı //markaları listele
	

	List<Brand> getAll(); //array yerine List kullanıyoruz.GetAll çağıran birisi markaları listeler.


}
