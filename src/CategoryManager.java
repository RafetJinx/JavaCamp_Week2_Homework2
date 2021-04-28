public class CategoryManager {

    // Kategori ekliyor
    public void addCategory(Category category){
        System.out.println(category.getId() + " id'li ve '" + category.categoryName + " isimli kategori eklendi.");
    }

    // Kategori siliyor
    public void deleteCategory(Category category){
        System.out.println(category.getId() + " id'li ve '" + category.getCategoryName() +  "' isimli kategori silindi.");
    }

    // Kategoriyi duzenliyor
    public void organizeCategory(Category category){
        System.out.println(category.getId() + " id'li ve '" + category.getCategoryName() + "isimli kategori düzenlendi.");
    }
}
