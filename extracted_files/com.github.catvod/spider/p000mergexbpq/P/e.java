package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f142short = {392, 403, 408, 403};
    private ByteBuffer b;
    private int a = 1;
    private CharBuffer c = null;
    private IntBuffer d = null;
    private int e = -1;

    e(int i) {
        this.b = C0022.m4407(i);
    }

    private void b(CharBuffer charBuffer) {
        char[] cArrM8140 = C0050.m8140(charBuffer);
        int iM4874 = C0025.m4874(charBuffer) + C0054.m8649(charBuffer);
        int iM1152 = C0001.m1152(charBuffer) + C0054.m8649(charBuffer);
        char[] cArrM81402 = C0050.m8140(m794(this));
        int iM48742 = C0025.m4874(m794(this)) + C0054.m8649(m794(this));
        while (iM4874 < iM1152) {
            char c = cArrM8140[iM4874];
            if (C0012.m3030(c)) {
                C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
                CharBuffer charBufferM794 = m794(this);
                C0043.m7356(charBufferM794, iM48742 - C0054.m8649(charBufferM794));
                int iM6363 = C0037.m6363(charBuffer);
                C0038.m6439(m794(this));
                IntBuffer intBufferM9514 = C0063.m9514(C0008.m1965(C0037.m6363(m794(this)) + iM6363, C0037.m6343(m794(this)) / 2));
                while (C0004.m1585(m794(this))) {
                    C0033.m5868(intBufferM9514, C0035.m6113(m794(this)) & 65535);
                }
                this.a = 3;
                this.c = null;
                this.d = intBufferM9514;
                m801(this, charBuffer);
                return;
            }
            cArrM81402[iM48742] = c;
            iM4874++;
            iM48742++;
        }
        C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
        CharBuffer charBufferM7942 = m794(this);
        C0043.m7356(charBufferM7942, iM48742 - C0054.m8649(charBufferM7942));
    }

    private void c(CharBuffer charBuffer) {
        char[] cArrM8140 = C0050.m8140(charBuffer);
        int iM4874 = C0025.m4874(charBuffer) + C0054.m8649(charBuffer);
        int iM1152 = C0001.m1152(charBuffer) + C0054.m8649(charBuffer);
        int[] iArrM8293 = C0052.m8293(m795(this));
        int iM48742 = C0025.m4874(m795(this)) + C0018.m3941(m795(this));
        while (true) {
            int i = -1;
            if (iM4874 >= iM1152) {
                break;
            }
            char c = cArrM8140[iM4874];
            iM4874++;
            if (m796(this) != -1) {
                if (C0058.m9155(c)) {
                    iArrM8293[iM48742] = C0020.m4257((char) m796(this), c);
                } else {
                    iArrM8293[iM48742] = m796(this);
                    iM48742++;
                    if (!C0012.m3030(c)) {
                        iArrM8293[iM48742] = 65535 & c;
                    }
                }
                iM48742++;
                this.e = i;
            } else if (!C0012.m3030(c)) {
                iArrM8293[iM48742] = c & 65535;
                iM48742++;
            }
            i = c & 65535;
            this.e = i;
        }
        int iM796 = m796(this);
        if (iM796 != -1) {
            iArrM8293[iM48742] = iM796 & 65535;
            iM48742++;
        }
        C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
        IntBuffer intBufferM795 = m795(this);
        C0021.m4350(intBufferM795, iM48742 - C0018.m3941(intBufferM795));
    }

    private static int e(int i) {
        return (int) C0053.m8392(2.0d, 32 - C0019.m4089(i - 1));
    }

    /* renamed from: ۟۟۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m794(Object obj) {
        if (C0034.m6048() < 0) {
            return ((e) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m795(Object obj) {
        if (C0037.m6350() < 0) {
            return ((e) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۢۧۥۦ, reason: not valid java name and contains not printable characters */
    public static int m796(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((e) obj).e;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m797(Object obj) {
        if (C0036.m6252() > 0) {
            return ((e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m798() {
        if (C0040.m6582() >= 0) {
            return f142short;
        }
        return null;
    }

    /* renamed from: ۤ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m799(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            ((e) obj).b((CharBuffer) obj2);
        }
    }

    /* renamed from: ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m800(int i) {
        if (C0006.m1726() <= 0) {
            return e(i);
        }
        return 0;
    }

    /* renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static void m801(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            ((e) obj).c((CharBuffer) obj2);
        }
    }

    /* renamed from: ۣۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m802(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((e) obj).b;
        }
        return null;
    }

    public final void a(CharBuffer charBuffer) {
        int iM6363 = C0037.m6363(charBuffer);
        int iM6078 = C0035.m6078(m797(this));
        if (iM6078 != 0) {
            if (iM6078 != 1) {
                if (iM6078 == 2 && C0037.m6363(m795(this)) < iM6363) {
                    IntBuffer intBufferM9514 = C0063.m9514(m800(C0037.m6343(m795(this)) + iM6363));
                    C0001.m1216(m795(this));
                    C0064.m9682(intBufferM9514, m795(this));
                    this.d = intBufferM9514;
                }
            } else if (C0037.m6363(m794(this)) < iM6363) {
                CharBuffer charBufferM7703 = C0046.m7703(m800(C0037.m6343(m794(this)) + iM6363));
                C0038.m6439(m794(this));
                C0007.m1862(charBufferM7703, m794(this));
                this.c = charBufferM7703;
            }
        } else if (C0037.m6363(m802(this)) < iM6363) {
            ByteBuffer byteBufferM4407 = C0022.m4407(m800(C0037.m6343(m802(this)) + iM6363));
            C0064.m9655(m802(this));
            C0029.m5213(byteBufferM4407, m802(this));
            this.b = byteBufferM4407;
        }
        if (!C0054.m8561(charBuffer)) {
            throw new UnsupportedOperationException(C0028.m5109(m798(), 0, 4, 476));
        }
        int iM60782 = C0035.m6078(m797(this));
        if (iM60782 != 0) {
            if (iM60782 == 1) {
                m799(this, charBuffer);
                return;
            } else {
                if (iM60782 != 2) {
                    return;
                }
                m801(this, charBuffer);
                return;
            }
        }
        char[] cArrM8140 = C0050.m8140(charBuffer);
        int iM4874 = C0025.m4874(charBuffer) + C0054.m8649(charBuffer);
        int iM1152 = C0001.m1152(charBuffer) + C0054.m8649(charBuffer);
        byte[] bArrM1530 = C0004.m1530(m802(this));
        int iM48742 = C0025.m4874(m802(this)) + C0050.m8117(m802(this));
        while (iM4874 < iM1152) {
            char c = cArrM8140[iM4874];
            if (c > 255) {
                C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
                ByteBuffer byteBufferM802 = m802(this);
                C0002.m1329(byteBufferM802, iM48742 - C0050.m8117(byteBufferM802));
                if (C0012.m3030(c)) {
                    int iM63632 = C0037.m6363(charBuffer);
                    C0064.m9655(m802(this));
                    IntBuffer intBufferM95142 = C0063.m9514(C0008.m1965(C0037.m6363(m802(this)) + iM63632, C0037.m6343(m802(this)) / 4));
                    while (C0004.m1585(m802(this))) {
                        C0033.m5868(intBufferM95142, C0038.m6453(m802(this)) & 255);
                    }
                    this.a = 3;
                    this.b = null;
                    this.d = intBufferM95142;
                    m801(this, charBuffer);
                    return;
                }
                int iM63633 = C0037.m6363(charBuffer);
                C0064.m9655(m802(this));
                CharBuffer charBufferM77032 = C0046.m7703(C0008.m1965(C0037.m6363(m802(this)) + iM63633, C0037.m6343(m802(this)) / 2));
                while (C0004.m1585(m802(this))) {
                    C0017.m3723(charBufferM77032, (char) (C0038.m6453(m802(this)) & 255));
                }
                this.a = 2;
                this.b = null;
                this.c = charBufferM77032;
                m799(this, charBuffer);
                return;
            }
            bArrM1530[iM48742] = (byte) (c & 255);
            iM4874++;
            iM48742++;
        }
        C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
        ByteBuffer byteBufferM8022 = m802(this);
        C0002.m1329(byteBufferM8022, iM48742 - C0050.m8117(byteBufferM8022));
    }

    public final f d() {
        int iM6078 = C0035.m6078(m797(this));
        if (iM6078 == 0) {
            C0064.m9655(m802(this));
        } else if (iM6078 == 1) {
            C0038.m6439(m794(this));
        } else if (iM6078 == 2) {
            C0001.m1216(m795(this));
        }
        return new f(m797(this), m802(this), m794(this), m795(this));
    }
}