package first_bad_version;

public class Main extends VersionControl {
    public Main(int target) {
        super(target);
    }

    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;  // Первая плохая версия где-то слева (включая mid)
            } else {
                left = mid + 1;  // Первая плохая версия справа от mid
            }
        }

        return left;
    }
}
