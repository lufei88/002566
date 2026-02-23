package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.Z.b;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f243short = {2859, 2823, 2836, 2829, 2886, 2831, 2824, 2832, 2823, 2826, 2831, 2818, 1466, 1465, 1451, 1495, 1485, 1443, 1410, 1485, 1423, 1432, 1419, 1419, 1416, 1439, 1485, 1409, 1416, 1419, 1433, 1485, 1433, 1410, 1485, 1432, 1411, 1422, 1410, 1411, 1438, 1432, 1408, 1416, 1475, 2315, 2315, 2408};
    private char[] a;
    private Reader b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g = -1;
    private String[] h = new String[512];
    private boolean i;

    public C0067a(Reader reader, int i) {
        C0017.m3716(C0000.m1068(reader));
        this.b = reader;
        this.a = new char[C0051.m8186(i, 32768)];
        m2557(this);
    }

    private void b() {
        int iM2560;
        int i;
        boolean z;
        if (m2550(this) || (iM2560 = m2560(this)) < m2551(this)) {
            return;
        }
        int iM2555 = m2555(this);
        if (iM2555 != -1) {
            i = iM2560 - iM2555;
            iM2560 = iM2555;
        } else {
            i = 0;
        }
        try {
            long j = iM2560;
            long jM8797 = C0055.m8797(m2556(this), j);
            C0004.m1529(m2556(this), 32768);
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 > 1024) {
                    break;
                }
                Reader readerM2556 = m2556(this);
                char[] cArrM2547 = m2547(this);
                int iM9307 = C0060.m9307(readerM2556, cArrM2547, i2, cArrM2547.length - i2);
                if (iM9307 == -1) {
                    this.i = true;
                }
                if (iM9307 <= 0) {
                    break;
                } else {
                    i2 += iM9307;
                }
            }
            C0021.m4382(m2556(this));
            if (i2 > 0) {
                if (jM8797 != j) {
                    z = false;
                }
                C0017.m3716(z);
                this.c = i2;
                this.f = m2554(this) + iM2560;
                this.e = i;
                if (m2555(this) != -1) {
                    this.g = 0;
                }
                this.d = C0051.m8186(i2, 24576);
            }
        } catch (IOException e) {
            throw new b(e);
        }
    }

    private static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        boolean z = true;
        if (i2 < 1) {
            return C0007.m1840();
        }
        int i3 = i2 * 31;
        int i4 = i;
        int i5 = 0;
        while (i5 < i2) {
            i3 = (i3 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int i6 = i3 & 511;
        String str = strArr[i6];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[i6] = str2;
            return str2;
        }
        if (i2 == C0004.m1584(str)) {
            int i7 = i;
            int i8 = i2;
            int i9 = 0;
            while (true) {
                int i10 = i8 - 1;
                if (i8 == 0) {
                    break;
                }
                int i11 = i7 + 1;
                int i12 = i9 + 1;
                if (cArr[i7] != C0007.m1823(str, i9)) {
                    break;
                }
                i7 = i11;
                i8 = i10;
                i9 = i12;
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        String str3 = new String(cArr, i, i2);
        strArr[i6] = str3;
        return str3;
    }

    private boolean u() {
        return m2560(this) >= m2548(this);
    }

    /* renamed from: ۟۠۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2546(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((C0067a) obj).u();
        }
        return false;
    }

    /* renamed from: ۟ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static char[] m2547(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((C0067a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2548(Object obj) {
        if (C0034.m6048() < 0) {
            return ((C0067a) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۧۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String[] m2549(Object obj) {
        if (C0009.m2047() > 0) {
            return ((C0067a) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2550(Object obj) {
        if (C0040.m6582() > 0) {
            return ((C0067a) obj).i;
        }
        return false;
    }

    /* renamed from: ۠۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static int m2551(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((C0067a) obj).d;
        }
        return 0;
    }

    /* renamed from: ۡۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2552(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((C0067a) obj).D((CharSequence) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2553() {
        if (C0049.m8038() < 0) {
            return f243short;
        }
        return null;
    }

    /* renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2554(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((C0067a) obj).f;
        }
        return 0;
    }

    /* renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2555(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((C0067a) obj).g;
        }
        return 0;
    }

    /* renamed from: ۤۢۦۧ, reason: not valid java name and contains not printable characters */
    public static Reader m2556(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0067a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m2557(Object obj) {
        if (C0014.m3353() < 0) {
            ((C0067a) obj).b();
        }
    }

    /* renamed from: ۤۤۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2558(Object obj, Object obj2, int i, int i2) {
        if (C0032.m5686() <= 0) {
            return c((char[]) obj, (String[]) obj2, i, i2);
        }
        return null;
    }

    /* renamed from: ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2559(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((C0067a) obj).r();
        }
        return null;
    }

    /* renamed from: ۨۧۥۢ, reason: not valid java name and contains not printable characters */
    public static int m2560(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0067a) obj).e;
        }
        return 0;
    }

    final boolean A(char[] cArr) {
        m2557(this);
        return !C0049.m8062(this) && C0007.m1892(cArr, m2547(this)[m2560(this)]) >= 0;
    }

    final boolean B() {
        char c;
        return !C0049.m8062(this) && (c = m2547(this)[m2560(this)]) >= '0' && c <= '9';
    }

    final boolean C() {
        if (C0049.m8062(this)) {
            return false;
        }
        char c = m2547(this)[m2560(this)];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || C0055.m8799(c);
    }

    final int D(CharSequence charSequence) {
        m2557(this);
        char cM7511 = C0044.m7511(charSequence, 0);
        int iM2560 = m2560(this);
        while (iM2560 < m2548(this)) {
            if (cM7511 != m2547(this)[iM2560]) {
                do {
                    iM2560++;
                    if (iM2560 >= m2548(this)) {
                        break;
                    }
                } while (cM7511 != m2547(this)[iM2560]);
            }
            int i = iM2560 + 1;
            int iM5114 = (C0028.m5114(charSequence) + i) - 1;
            int iM2548 = m2548(this);
            if (iM2560 < iM2548 && iM5114 <= iM2548) {
                int i2 = i;
                for (int i3 = 1; i2 < iM5114 && C0044.m7511(charSequence, i3) == m2547(this)[i2]; i3++) {
                    i2++;
                }
                if (i2 == iM5114) {
                    return iM2560 - m2560(this);
                }
            }
            iM2560 = i;
        }
        return -1;
    }

    public final int E() {
        return m2554(this) + m2560(this);
    }

    final void F() {
        int iM2555 = m2555(this);
        if (iM2555 == -1) {
            throw new b(new IOException(C0016.m3525(m2553(), 0, 12, 2918)));
        }
        this.e = iM2555;
        this.g = -1;
    }

    final void G() {
        int iM2560 = m2560(this);
        if (iM2560 < 1) {
            throw new b(new IOException(C0002.m1305(m2553(), 12, 33, 1517)));
        }
        this.e = iM2560 - 1;
    }

    final void H() {
        this.g = -1;
    }

    public final void a() {
        this.e = m2560(this) + 1;
    }

    public final void d() {
        Reader readerM2556 = m2556(this);
        if (readerM2556 == null) {
            return;
        }
        try {
            C0056.m8864(readerM2556);
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

    final char e() {
        m2557(this);
        char c = m2546(this) ? (char) 65535 : m2547(this)[m2560(this)];
        this.e = m2560(this) + 1;
        return c;
    }

    final String f(boolean z) {
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        while (i < iM2548) {
            char c = cArrM2547[i];
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
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String g() {
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        while (i < iM2548) {
            char c = cArrM2547[i];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i++;
        }
        this.e = i;
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String h() {
        int iM2560;
        char c;
        m2557(this);
        int iM25602 = m2560(this);
        while (true) {
            iM2560 = m2560(this);
            if (iM2560 >= m2548(this) || (c = m2547(this)[iM2560]) < '0' || c > '9') {
                break;
            }
            this.e = iM2560 + 1;
        }
        return m2558(m2547(this), m2549(this), iM25602, iM2560 - iM25602);
    }

    final String i() {
        int iM2560;
        char c;
        m2557(this);
        int iM25602 = m2560(this);
        while (true) {
            iM2560 = m2560(this);
            if (iM2560 >= m2548(this) || (((c = m2547(this)[iM2560]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.e = iM2560 + 1;
        }
        return m2558(m2547(this), m2549(this), iM25602, iM2560 - iM25602);
    }

    final String j() {
        char c;
        m2557(this);
        int iM2560 = m2560(this);
        while (true) {
            int iM25602 = m2560(this);
            if (iM25602 >= m2548(this) || (((c = m2547(this)[iM25602]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !C0055.m8799(c)))) {
                break;
            }
            this.e = m2560(this) + 1;
        }
        return m2558(m2547(this), m2549(this), iM2560, m2560(this) - iM2560);
    }

    final String k() {
        char c;
        m2557(this);
        int iM2560 = m2560(this);
        while (true) {
            int iM25602 = m2560(this);
            if (iM25602 >= m2548(this) || (((c = m2547(this)[iM25602]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !C0055.m8799(c)))) {
                break;
            }
            this.e = m2560(this) + 1;
        }
        while (!m2546(this)) {
            char[] cArrM2547 = m2547(this);
            int iM25603 = m2560(this);
            char c2 = cArrM2547[iM25603];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.e = iM25603 + 1;
        }
        return m2558(m2547(this), m2549(this), iM2560, m2560(this) - iM2560);
    }

    final String l() {
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        while (i < iM2548) {
            char c = cArrM2547[i];
            if (c == 0 || c == '<') {
                break;
            }
            i++;
        }
        this.e = i;
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String m() {
        m2557(this);
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        while (i < iM2548) {
            char c = cArrM2547[i];
            if (c == 0 || c == ' ' || c == '/' || c == '<' || c == '>' || c == '\t' || c == '\n' || c == '\f' || c == '\r') {
                break;
            }
            i++;
        }
        this.e = i;
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String n() {
        int iM2552 = m2552(this, C0041.m6779(m2553(), 45, 3, 2390));
        if (iM2552 != -1) {
            String strM2558 = m2558(m2547(this), m2549(this), m2560(this), iM2552);
            this.e = m2560(this) + iM2552;
            return strM2558;
        }
        int iM2548 = m2548(this);
        int iM2560 = m2560(this);
        if (iM2548 - iM2560 < 3) {
            return m2559(this);
        }
        int i = (iM2548 - 3) + 1;
        String strM25582 = m2558(m2547(this), m2549(this), iM2560, i - iM2560);
        this.e = i;
        return strM25582;
    }

    public final String o(char c) {
        int iM2560;
        m2557(this);
        int iM25602 = m2560(this);
        while (true) {
            if (iM25602 >= m2548(this)) {
                iM2560 = -1;
                break;
            }
            if (c == m2547(this)[iM25602]) {
                iM2560 = iM25602 - m2560(this);
                break;
            }
            iM25602++;
        }
        if (iM2560 == -1) {
            return m2559(this);
        }
        String strM2558 = m2558(m2547(this), m2549(this), m2560(this), iM2560);
        this.e = m2560(this) + iM2560;
        return strM2558;
    }

    public final String p(char... cArr) {
        m2557(this);
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        loop0: while (i < iM2548) {
            for (char c : cArr) {
                if (cArrM2547[i] == c) {
                    break loop0;
                }
            }
            i++;
        }
        this.e = i;
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String q(char... cArr) {
        m2557(this);
        int iM2560 = m2560(this);
        int iM2548 = m2548(this);
        char[] cArrM2547 = m2547(this);
        int i = iM2560;
        while (i < iM2548 && C0007.m1892(cArr, cArrM2547[i]) < 0) {
            i++;
        }
        this.e = i;
        return i > iM2560 ? m2558(m2547(this), m2549(this), iM2560, i - iM2560) : C0007.m1840();
    }

    final String r() {
        m2557(this);
        char[] cArrM2547 = m2547(this);
        String[] strArrM2549 = m2549(this);
        int iM2560 = m2560(this);
        String strM2558 = m2558(cArrM2547, strArrM2549, iM2560, m2548(this) - iM2560);
        this.e = m2548(this);
        return strM2558;
    }

    public final char s() {
        m2557(this);
        if (m2546(this)) {
            return (char) 65535;
        }
        return m2547(this)[m2560(this)];
    }

    public final boolean t() {
        m2557(this);
        return m2560(this) >= m2548(this);
    }

    public final String toString() {
        int iM2548 = m2548(this);
        int iM2560 = m2560(this);
        return iM2548 - iM2560 < 0 ? C0007.m1840() : new String(m2547(this), iM2560, iM2548 - iM2560);
    }

    final void v() {
        if (m2548(this) - m2560(this) < 1024) {
            this.d = 0;
        }
        m2557(this);
        this.g = m2560(this);
    }

    final boolean w(String str) {
        boolean z;
        m2557(this);
        m2557(this);
        int iM1584 = C0004.m1584(str);
        if (iM1584 > m2548(this) - m2560(this)) {
            z = false;
            break;
        }
        for (int i = 0; i < iM1584; i++) {
            if (C0007.m1823(str, i) != m2547(this)[m2560(this) + i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = C0004.m1584(str) + m2560(this);
        return true;
    }

    final boolean x(String str) {
        boolean z;
        m2557(this);
        int iM1584 = C0004.m1584(str);
        if (iM1584 > m2548(this) - m2560(this)) {
            z = false;
            break;
        }
        for (int i = 0; i < iM1584; i++) {
            if (C0048.m7959(C0007.m1823(str, i)) != C0048.m7959(m2547(this)[m2560(this) + i])) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        this.e = C0004.m1584(str) + m2560(this);
        return true;
    }

    final boolean y(char c) {
        return !C0049.m8062(this) && m2547(this)[m2560(this)] == c;
    }

    final boolean z(char... cArr) {
        if (C0049.m8062(this)) {
            return false;
        }
        m2557(this);
        char c = m2547(this)[m2560(this)];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}