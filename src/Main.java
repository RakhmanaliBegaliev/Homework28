
import java.util.Optional;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5,6,7,8,9};
        Optional<Integer>optional=Stream.of(integers).filter(d->d%2==0).map(c->c*c).max((x,y)->Integer.compare(x,y));
        System.out.println(optional);
    }
}