package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.U0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f567short = {1014, 1384, 1348, 1367, 1358, 1285, 1356, 1355, 1363, 1348, 1353, 1356, 1345, 3059, 3056, 3042, 2974, 2948, 3050, 3019, 2948, 3014, 3025, 3010, 3010, 3009, 3030, 2948, 3016, 3009, 3010, 3024, 2948, 3024, 3019, 2948, 3025, 3018, 3015, 3019, 3018, 3031, 3025, 3017, 3009, 2954};
    public char[] a;
    public Reader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = -1;
    public String[] h = new String[512];
    public ArrayList i = null;
    public int j = 1;
    public boolean k;
    public String l;
    public int m;

    public C0174a(StringReader stringReader, int i) {
        C0042.m7163(C0000.m1068(stringReader));
        this.b = stringReader;
        this.a = new char[C0051.m8186(i, 32768)];
        C0013.m3122(this);
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return C0007.m1840();
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + cArr[i + i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null && i2 == C0004.m1584(str)) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] != C0007.m1823(str, i3)) {
                    break;
                }
                i7 = i10;
                i8 = i9;
                i3 = i11;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    /* renamed from: ۤۡۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5510() {
        if (C0054.m8557() <= 0) {
            return f567short;
        }
        return null;
    }

    public final void a() {
        this.e = C0059.m9189(this) + 1;
    }

    public final void b() {
        int iM9189;
        int i;
        boolean z;
        if (C0051.m8178(this) || (iM9189 = C0059.m9189(this)) < C0063.m9492(this)) {
            return;
        }
        int iM7764 = C0047.m7764(this);
        if (iM7764 != -1) {
            i = iM9189 - iM7764;
            iM9189 = iM7764;
        } else {
            i = 0;
        }
        try {
            long j = iM9189;
            long jM8797 = C0055.m8797(C0019.m4035(this), j);
            C0004.m1529(C0019.m4035(this), 32768);
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 > 1024) {
                    break;
                }
                Reader readerM4035 = C0019.m4035(this);
                char[] cArrM3565 = C0016.m3565(this);
                int iM9307 = C0060.m9307(readerM4035, cArrM3565, i2, cArrM3565.length - i2);
                if (iM9307 == -1) {
                    this.k = true;
                }
                if (iM9307 <= 0) {
                    break;
                } else {
                    i2 += iM9307;
                }
            }
            C0021.m4382(C0019.m4035(this));
            if (i2 > 0) {
                if (jM8797 != j) {
                    z = false;
                }
                C0042.m7163(z);
                this.c = i2;
                this.f = C0002.m1254(this) + iM9189;
                this.e = i;
                if (C0047.m7764(this) != -1) {
                    this.g = 0;
                }
                this.d = C0051.m8186(i2, 24576);
            }
            C0062.m9407(this);
            this.l = null;
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Q0.a(e);
        }
    }

    public final void d() {
        Reader readerM4035 = C0019.m4035(this);
        if (readerM4035 == null) {
            return;
        }
        try {
            C0056.m8864(readerM4035);
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.b = null;
            this.a = null;
            this.h = null;
            throw th;
        }
        this.b = null;
        this.a = null;
        this.h = null;
    }

    public final char e() {
        C0013.m3122(this);
        int iM9189 = C0059.m9189(this);
        char c = iM9189 >= C0056.m8947(this) ? (char) 65535 : C0016.m3565(this)[iM9189];
        this.e = iM9189 + 1;
        return c;
    }

    public final String f(boolean z) {
        int iM9189 = C0059.m9189(this);
        int iM8947 = C0056.m8947(this);
        char[] cArrM3565 = C0016.m3565(this);
        int i = iM9189;
        while (i < iM8947) {
            char c = cArrM3565[i];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'') {
                    if (!z) {
                        break;
                        break;
                    }
                    break;
                }
                continue;
                i++;
            }
            if (!z) {
                break;
            }
            i++;
        }
        this.e = i;
        return i > iM9189 ? C0021.m4319(C0016.m3565(this), C0037.m6378(this), iM9189, i - iM9189) : C0007.m1840();
    }

    public final String g() {
        int iM9189 = C0059.m9189(this);
        int iM8947 = C0056.m8947(this);
        char[] cArrM3565 = C0016.m3565(this);
        int i = iM9189;
        while (i < iM8947) {
            char c = cArrM3565[i];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i++;
        }
        this.e = i;
        return i > iM9189 ? C0021.m4319(C0016.m3565(this), C0037.m6378(this), iM9189, i - iM9189) : C0007.m1840();
    }

    public final String h() {
        char c;
        C0013.m3122(this);
        int iM9189 = C0059.m9189(this);
        while (true) {
            int iM91892 = C0059.m9189(this);
            if (iM91892 >= C0056.m8947(this) || (((c = C0016.m3565(this)[iM91892]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !C0055.m8799(c)))) {
                break;
            }
            this.e = C0059.m9189(this) + 1;
        }
        return C0021.m4319(C0016.m3565(this), C0037.m6378(this), iM9189, C0059.m9189(this) - iM9189);
    }

    public final String i(char c) {
        int iM9189;
        C0013.m3122(this);
        int iM91892 = C0059.m9189(this);
        while (true) {
            if (iM91892 >= C0056.m8947(this)) {
                iM9189 = -1;
                break;
            }
            if (c == C0016.m3565(this)[iM91892]) {
                iM9189 = iM91892 - C0059.m9189(this);
                break;
            }
            iM91892++;
        }
        if (iM9189 != -1) {
            String strM4319 = C0021.m4319(C0016.m3565(this), C0037.m6378(this), C0059.m9189(this), iM9189);
            this.e = C0059.m9189(this) + iM9189;
            return strM4319;
        }
        C0013.m3122(this);
        char[] cArrM3565 = C0016.m3565(this);
        String[] strArrM6378 = C0037.m6378(this);
        int iM91893 = C0059.m9189(this);
        String strM43192 = C0021.m4319(cArrM3565, strArrM6378, iM91893, C0056.m8947(this) - iM91893);
        this.e = C0056.m8947(this);
        return strM43192;
    }

    public final String j(char... cArr) {
        C0013.m3122(this);
        int iM9189 = C0059.m9189(this);
        int iM8947 = C0056.m8947(this);
        char[] cArrM3565 = C0016.m3565(this);
        int i = iM9189;
        loop0: while (i < iM8947) {
            for (char c : cArr) {
                if (cArrM3565[i] == c) {
                    break loop0;
                }
            }
            i++;
        }
        this.e = i;
        return i > iM9189 ? C0021.m4319(C0016.m3565(this), C0037.m6378(this), iM9189, i - iM9189) : C0007.m1840();
    }

    public final String k(char... cArr) {
        C0013.m3122(this);
        int iM9189 = C0059.m9189(this);
        int iM8947 = C0056.m8947(this);
        char[] cArrM3565 = C0016.m3565(this);
        int i = iM9189;
        while (i < iM8947 && C0007.m1892(cArr, cArrM3565[i]) < 0) {
            i++;
        }
        this.e = i;
        return i > iM9189 ? C0021.m4319(C0016.m3565(this), C0037.m6378(this), iM9189, i - iM9189) : C0007.m1840();
    }

    public final char l() {
        C0013.m3122(this);
        int iM9189 = C0059.m9189(this);
        if (iM9189 >= C0056.m8947(this)) {
            return (char) 65535;
        }
        return C0016.m3565(this)[iM9189];
    }

    public final String m() {
        int iM7986;
        int iM7567;
        StringBuilder sb = new StringBuilder();
        int iM7148 = C0042.m7148(this);
        if (C0013.m3149(this) != null) {
            int iM75672 = C0045.m7567(this, iM7148);
            iM7986 = iM75672 == -1 ? C0049.m7986(this) : iM75672 + C0049.m7986(this) + 1;
        } else {
            iM7986 = 1;
        }
        C0036.m6177(sb, iM7986);
        C0018.m3933(sb, C0024.m4740(m5510(), 0, 1, 972));
        int iM71482 = C0042.m7148(this);
        if (C0013.m3149(this) != null && (iM7567 = C0045.m7567(this, iM71482)) != -1) {
            iM71482 -= C0024.m4690((Integer) C0028.m5167(C0013.m3149(this), iM7567));
        }
        C0036.m6177(sb, iM71482 + 1);
        return C0047.m7763(sb);
    }

    public final boolean n() {
        C0013.m3122(this);
        return C0059.m9189(this) >= C0056.m8947(this);
    }

    public final int o(int i) {
        ArrayList arrayListM3149 = C0013.m3149(this);
        if (arrayListM3149 == null) {
            return 0;
        }
        int iM1608 = C0005.m1608(arrayListM3149, C0011.m2808(i));
        return iM1608 < -1 ? C0010.m2374(iM1608) - 2 : iM1608;
    }

    public final boolean p(String str) {
        C0013.m3122(this);
        C0013.m3122(this);
        int iM1584 = C0004.m1584(str);
        if (iM1584 <= C0056.m8947(this) - C0059.m9189(this)) {
            for (int i = 0; i < iM1584; i++) {
                if (C0007.m1823(str, i) == C0016.m3565(this)[C0059.m9189(this) + i]) {
                }
            }
            this.e = C0004.m1584(str) + C0059.m9189(this);
            return true;
        }
        return false;
    }

    public final boolean q(String str) {
        C0013.m3122(this);
        int iM1584 = C0004.m1584(str);
        if (iM1584 <= C0056.m8947(this) - C0059.m9189(this)) {
            for (int i = 0; i < iM1584; i++) {
                if (C0048.m7959(C0007.m1823(str, i)) == C0048.m7959(C0016.m3565(this)[C0059.m9189(this) + i])) {
                }
            }
            this.e = C0004.m1584(str) + C0059.m9189(this);
            return true;
        }
        return false;
    }

    public final boolean r(char c) {
        return !C0065.m9730(this) && C0016.m3565(this)[C0059.m9189(this)] == c;
    }

    public final boolean s(char... cArr) {
        if (C0065.m9730(this)) {
            return false;
        }
        C0013.m3122(this);
        char c = C0016.m3565(this)[C0059.m9189(this)];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        if (C0065.m9730(this)) {
            return false;
        }
        char c = C0016.m3565(this)[C0059.m9189(this)];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public final String toString() {
        int iM8947 = C0056.m8947(this);
        int iM9189 = C0059.m9189(this);
        return iM8947 - iM9189 < 0 ? C0007.m1840() : new String(C0016.m3565(this), iM9189, iM8947 - iM9189);
    }

    public final boolean u() {
        if (C0065.m9730(this)) {
            return false;
        }
        char c = C0016.m3565(this)[C0059.m9189(this)];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || C0055.m8799(c);
    }

    public final int v(String str) {
        C0013.m3122(this);
        char cM1823 = C0007.m1823(str, 0);
        int iM9189 = C0059.m9189(this);
        while (iM9189 < C0056.m8947(this)) {
            if (cM1823 != C0016.m3565(this)[iM9189]) {
                do {
                    iM9189++;
                    if (iM9189 >= C0056.m8947(this)) {
                        break;
                    }
                } while (cM1823 != C0016.m3565(this)[iM9189]);
            }
            int i = iM9189 + 1;
            int iM1584 = (C0004.m1584(str) + i) - 1;
            int iM8947 = C0056.m8947(this);
            if (iM9189 < iM8947 && iM1584 <= iM8947) {
                int i2 = i;
                for (int i3 = 1; i2 < iM1584 && C0007.m1823(str, i3) == C0016.m3565(this)[i2]; i3++) {
                    i2++;
                }
                if (i2 == iM1584) {
                    return iM9189 - C0059.m9189(this);
                }
            }
            iM9189 = i;
        }
        return -1;
    }

    public final int w() {
        return C0002.m1254(this) + C0059.m9189(this);
    }

    public final void x() {
        int iM7764 = C0047.m7764(this);
        if (iM7764 == -1) {
            throw new com.github.catvod.spider.merge.Q0.a(new IOException(C0049.m8007(m5510(), 1, 12, 1317)));
        }
        this.e = iM7764;
        this.g = -1;
    }

    public final void y() {
        ArrayList arrayListM3149 = C0013.m3149(this);
        if (arrayListM3149 != null) {
            if (C0009.m2139(arrayListM3149) > 0) {
                int iM7567 = C0045.m7567(this, C0002.m1254(this));
                if (iM7567 == -1) {
                    iM7567 = 0;
                }
                Integer num = (Integer) C0028.m5167(C0013.m3149(this), iM7567);
                C0047.m7777(num);
                this.j = C0049.m7986(this) + iM7567;
                C0017.m3687(C0013.m3149(this));
                C0004.m1532(C0013.m3149(this), num);
            }
            for (int iM9189 = C0059.m9189(this); iM9189 < C0056.m8947(this); iM9189++) {
                if (C0016.m3565(this)[iM9189] == '\n') {
                    C0004.m1532(C0013.m3149(this), C0011.m2808(C0002.m1254(this) + 1 + iM9189));
                }
            }
        }
    }

    public final void z() {
        int iM9189 = C0059.m9189(this);
        if (iM9189 < 1) {
            throw new com.github.catvod.spider.merge.Q0.a(new IOException(C0054.m8574(m5510(), 13, 33, 2980)));
        }
        this.e = iM9189 - 1;
    }
}