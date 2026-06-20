class TimeMap {
    Map<String, String> m = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        String k = timestamp + key;
        m.put(k, value);
    }
    
    public String get(String key, int timestamp) {
        
        for (int i = timestamp ;i>0;i--)
        {
            String k = i + key;
            if(m.get(k)!=null){return m.get(k);}
        }
        return "";
        
    }
}
