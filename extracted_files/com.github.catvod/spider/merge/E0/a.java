package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public final class a {
    public ByteBuffer b;
    public int a = 1;
    public CharBuffer c = null;
    public IntBuffer d = null;
    public int e = -1;

    public a(int i) {
        this.b = C0022.m4407(i);
    }

    public static int c(int i) {
        return (int) C0053.m8392(2.0d, 32 - C0019.m4089(i - 1));
    }

    public final void a(CharBuffer charBuffer) {
        char[] cArrM8140 = C0050.m8140(charBuffer);
        int iM4874 = C0025.m4874(charBuffer) + C0054.m8649(charBuffer);
        int iM1152 = C0001.m1152(charBuffer) + C0054.m8649(charBuffer);
        char[] cArrM81402 = C0050.m8140(C0037.m6380(this));
        int iM48742 = C0025.m4874(C0037.m6380(this)) + C0054.m8649(C0037.m6380(this));
        while (iM4874 < iM1152) {
            char c = cArrM8140[iM4874];
            if (C0012.m3030(c)) {
                C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
                CharBuffer charBufferM6380 = C0037.m6380(this);
                C0043.m7356(charBufferM6380, iM48742 - C0054.m8649(charBufferM6380));
                int iM6363 = C0037.m6363(charBuffer);
                C0038.m6439(C0037.m6380(this));
                IntBuffer intBufferM9514 = C0063.m9514(C0008.m1965(C0037.m6363(C0037.m6380(this)) + iM6363, C0037.m6343(C0037.m6380(this)) / 2));
                while (C0004.m1585(C0037.m6380(this))) {
                    C0033.m5868(intBufferM9514, C0035.m6113(C0037.m6380(this)) & 65535);
                }
                this.a = 3;
                this.c = null;
                this.d = intBufferM9514;
                C0044.m7461(this, charBuffer);
                return;
            }
            cArrM81402[iM48742] = c;
            iM4874++;
            iM48742++;
        }
        C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
        CharBuffer charBufferM63802 = C0037.m6380(this);
        C0043.m7356(charBufferM63802, iM48742 - C0054.m8649(charBufferM63802));
    }

    public final void b(CharBuffer charBuffer) {
        char[] cArrM8140 = C0050.m8140(charBuffer);
        int iM4874 = C0025.m4874(charBuffer) + C0054.m8649(charBuffer);
        int iM1152 = C0001.m1152(charBuffer) + C0054.m8649(charBuffer);
        int[] iArrM8293 = C0052.m8293(C0030.m5432(this));
        int iM48742 = C0025.m4874(C0030.m5432(this)) + C0018.m3941(C0030.m5432(this));
        while (true) {
            int i = -1;
            if (iM4874 >= iM1152) {
                break;
            }
            char c = cArrM8140[iM4874];
            iM4874++;
            if (C0009.m2060(this) != -1) {
                if (C0058.m9155(c)) {
                    iArrM8293[iM48742] = C0020.m4257((char) C0009.m2060(this), c);
                    iM48742++;
                } else {
                    iArrM8293[iM48742] = C0009.m2060(this);
                    int i2 = iM48742 + 1;
                    if (C0012.m3030(c)) {
                        this.e = c & 65535;
                        iM48742 = i2;
                    } else {
                        iArrM8293[i2] = 65535 & c;
                        iM48742 += 2;
                    }
                }
                this.e = i;
            } else if (C0012.m3030(c)) {
                i = c & 65535;
                this.e = i;
            } else {
                iArrM8293[iM48742] = c & 65535;
                iM48742++;
            }
        }
        int iM2060 = C0009.m2060(this);
        if (iM2060 != -1) {
            iArrM8293[iM48742] = iM2060 & 65535;
            iM48742++;
        }
        C0043.m7356(charBuffer, iM4874 - C0054.m8649(charBuffer));
        IntBuffer intBufferM5432 = C0030.m5432(this);
        C0021.m4350(intBufferM5432, iM48742 - C0018.m3941(intBufferM5432));
    }
}