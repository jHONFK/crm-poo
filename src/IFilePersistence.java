public interface IFilePersistence {
    void saveData(String fileName, Object object);
    Object loadData(String fileName);
}
