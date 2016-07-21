package JustTest.multi_extends;

/**
 * Created by zjutK on 16/7/19.
 */
public class son {
    class Father_1 extends father{
        public int strong(){
            return super.strong() + 1;
        }
    }

    class Mother_1 extends mother{
        public int kind(){
            return super.kind() - 1;
        }
    }

    public int getStrong(){
        return new Father_1().strong();
    }

    public int getKind(){
        return new Mother_1().kind();
    }
}



