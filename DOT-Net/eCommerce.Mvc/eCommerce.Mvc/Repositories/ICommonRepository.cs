namespace   eCommerce.Mvc.Repositories;

public interface ICommonRepository<T>
{
    Task<List<T>> GetAllAsync();
    Task<T> GetDetailsAsync(int id);
    Task<int> InsertAsync(T item);
    Task<int> UpdateAsync(T item);
    Task<int> DeleteAsync(int id);
}
