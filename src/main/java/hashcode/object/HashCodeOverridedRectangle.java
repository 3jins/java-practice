package hashcode.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HashCodeOverridedRectangle {
    private int width;
    private int height;

    public int getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HashCodeOverridedRectangle)) {
            return false;
        }
        final HashCodeOverridedRectangle overrided = (HashCodeOverridedRectangle) o;
        return (this.width == overrided.getWidth()
                && this.height == overrided.getHeight());
    }

    @Override
    public int hashCode() {
        int prime1 = 29;
        int prime2 = 37;
        return Integer.hashCode(width) * prime1 + Integer.hashCode(height) * prime2;
    }
}
