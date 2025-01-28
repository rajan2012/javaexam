public class DictionaryElement {

    Object key;
    Object value;

    public DictionaryElement(Object key, Object value)
    {
        this.key=key;
        this.value=value;
    }

    void setkey(Object key)
    {
        this.key=key;
    }

    void setvalue(Object value)
    {
        this.value=value;
    }

    Object getkey()
    {
        return key;
    }

    Object getvalue()
    {
        return value;
    }


}
