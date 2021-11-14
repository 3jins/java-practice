package hashcode.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HashCodeNotOverridedRectangle {
    private int width;
    private int height;

    public int getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HashCodeNotOverridedRectangle)) {
            return false;
        }
        final HashCodeNotOverridedRectangle overrided = (HashCodeNotOverridedRectangle) o;
        return (this.width == overrided.getWidth()
                && this.height == overrided.getHeight());
    }
}
