public class BrokenLine2 extends BrokenLine{
    @Override
    public int length() {
        int res =  super.length();
        res += lines.get(lines.size() - 1).length(lines.get(0));
        return res;
    }
}
