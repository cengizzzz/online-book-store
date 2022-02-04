package requistion.domain;

import java.util.Objects;

public final class RequistionID {
    private final String requistionID;

    private RequistionID(String requistionID) {
        this.requistionID = requistionID;
    }

    public static RequistionID of(String value) {
        return new RequistionID(value);
    }

    public String getRequistionID() {
        return requistionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequistionID that = (RequistionID) o;
        return requistionID.equals(that.requistionID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requistionID);
    }

    @Override
    public String toString() {
        return "RequistionID{" +
                "requistionID='" + requistionID + '\'' +
                '}';
    }
}