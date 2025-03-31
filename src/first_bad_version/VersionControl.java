package first_bad_version;

public class VersionControl {

    private int target;

    public VersionControl(int target) {
        this.target = target;
    }

    public boolean isBadVersion(int version) {
        return version >= target;

    }
}
