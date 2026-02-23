package com.github.catvod.spider.merge.N0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.M0.f;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements Serializable {
    public static final ThreadLocal q;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public String d;
    public String e;
    public final String f;
    public boolean g;
    public String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f471short = {2511, 2062, 697, 1122, 1677, 2574, 521, 603, 576, 601, 601, 523, 1446, 1513, 1523, 1504, 1535, 1447, 3207, 1510, 924, 2383, 2383, 2869, 822, 801, 812, 821, 805, 1680, 1693, 1685, 1690, 1692, 1675, 3110};
    public static final b p = new b(0);

    static {
        new b(1);
        q = new ThreadLocal();
    }

    public b(byte b) {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = C0012.m2973(m4621(), 0, 1, 2452);
        this.e = C0050.m8131(m4621(), 1, 1, 2131);
        this.f = C0027.m5062(m4621(), 2, 1, 644);
        this.h = C0017.m3646(m4621(), 3, 1, 1102);
        this.i = C0006.m1774(m4621(), 4, 1, 1782);
        this.j = C0036.m6188(m4621(), 5, 1, 2675);
        this.k = C0042.m7151(m4621(), 6, 6, 565);
        this.l = C0028.m5109(m4621(), 12, 6, 1434);
        String strM9389 = C0062.m9389(m4621(), 18, 1, 3257);
        this.m = strM9389;
        this.n = C0031.m5565(m4621(), 19, 1, 1498);
        this.o = strM9389;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        this((byte) 0);
        switch (i) {
            case 1:
                this((byte) 0);
                this.d = C0048.m7902(m4621(), 20, 1, 967);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0015.m3476());
                C0018.m3933(sb, C0058.m9106(m4621(), 21, 2, 2415));
                String strM7763 = C0047.m7763(sb);
                String strM1840 = C0007.m1840();
                this.h = strM7763 == null ? strM1840 : strM7763;
                this.g = true;
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0015.m3476());
                C0018.m3933(sb2, C0044.m7509(m4621(), 23, 1, 2920));
                String strM77632 = C0047.m7763(sb2);
                this.e = strM77632 != null ? strM77632 : strM1840;
                break;
            default:
                break;
        }
    }

    public static void i(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocalM8962 = C0057.m8962();
            if (((Map) C0017.m3710(threadLocalM8962)) == null) {
                C0042.m7194(threadLocalM8962, new WeakHashMap());
            }
            C0006.m1755((Map) C0017.m3710(threadLocalM8962), obj, null);
        }
    }

    public static void j(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocalM8962 = C0057.m8962();
            Map map = (Map) C0017.m3710(threadLocalM8962);
            if (map != null) {
                C0043.m7292(map, obj);
                if (C0012.m2970(map)) {
                    C0062.m9382(threadLocalM8962);
                }
            }
        }
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m4621() {
        if (C0063.m9589() < 0) {
            return f471short;
        }
        return null;
    }

    public void a(StringBuffer stringBuffer, Object obj) {
        String strM7718 = C0046.m7718(m4621(), 24, 5, 832);
        C0036.m6190(this, stringBuffer, strM7718);
        if (obj == null) {
            C0051.m8251(stringBuffer, C0014.m3359(this));
        } else {
            C0006.m1719(this, stringBuffer, strM7718, obj, true);
        }
        C0051.m8251(stringBuffer, C0036.m6242(this));
    }

    public void b(StringBuffer stringBuffer, char c) {
        C0018.m3884(stringBuffer, c);
    }

    public void c(StringBuffer stringBuffer, String str, Object obj) {
        C0039.m6541(stringBuffer, obj);
    }

    public void d(StringBuffer stringBuffer, String str, Collection collection) {
        C0039.m6541(stringBuffer, collection);
    }

    public void e(StringBuffer stringBuffer, Map map) {
        C0039.m6541(stringBuffer, map);
    }

    public void f(StringBuffer stringBuffer, String str) {
        if (!C0048.m7908(this) || str == null) {
            return;
        }
        C0051.m8251(stringBuffer, str);
        C0051.m8251(stringBuffer, C0020.m4262(this));
    }

    public final void g(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int iM6428;
        Map map = (Map) C0017.m3710(C0057.m8962());
        int i = 0;
        if (map != null && C0024.m4748(map, obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            C0056.m8946(obj, new f(C0054.m8574(m4621(), 29, 6, 1791), new Object[0]));
            String strM3085 = C0013.m3085(C0047.m7777(obj));
            String strM8889 = C0056.m8889(C0026.m4968(obj));
            C0016.m3556(stringBuffer, C0004.m1584(strM8889) + C0004.m1584(strM3085) + C0064.m9641(stringBuffer) + 1);
            C0051.m8251(stringBuffer, strM3085);
            C0018.m3884(stringBuffer, '@');
            C0051.m8251(stringBuffer, strM8889);
            return;
        }
        C0027.m4999(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    C0030.m5387(this, stringBuffer, str, (Collection) obj);
                } else {
                    iM6428 = C0049.m8006((Collection) obj);
                    C0003.m1429(this, stringBuffer, iM6428);
                }
            } else if (!(obj instanceof Map)) {
                boolean z2 = obj instanceof long[];
                String strM4795 = C0025.m4795(m4621(), 35, 1, 3082);
                if (z2) {
                    if (z) {
                        long[] jArr = (long[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < jArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0019.m4122(stringBuffer, jArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((long[]) obj).length);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        int[] iArr = (int[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < iArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0027.m5046(stringBuffer, iArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((int[]) obj).length);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        short[] sArr = (short[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < sArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0027.m5046(stringBuffer, sArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((short[]) obj).length);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        byte[] bArr = (byte[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < bArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0027.m5046(stringBuffer, bArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((byte[]) obj).length);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        char[] cArr = (char[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < cArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0045.m7639(this, stringBuffer, cArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((char[]) obj).length);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        double[] dArr = (double[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < dArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0003.m1413(stringBuffer, dArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((double[]) obj).length);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        float[] fArr = (float[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < fArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0044.m7438(stringBuffer, fArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((float[]) obj).length);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        boolean[] zArr = (boolean[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < zArr.length) {
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            C0036.m6237(stringBuffer, zArr[i]);
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((boolean[]) obj).length);
                    }
                } else if (C0001.m1178(C0047.m7777(obj))) {
                    if (z) {
                        Object[] objArr = (Object[]) obj;
                        C0051.m8251(stringBuffer, C0018.m3912(this));
                        while (i < objArr.length) {
                            Object obj2 = objArr[i];
                            if (i > 0) {
                                C0051.m8251(stringBuffer, strM4795);
                            }
                            if (obj2 == null) {
                                C0051.m8251(stringBuffer, C0014.m3359(this));
                            } else {
                                C0006.m1719(this, stringBuffer, str, obj2, true);
                            }
                            i++;
                        }
                        C0051.m8251(stringBuffer, C0004.m1514(this));
                    } else {
                        C0003.m1429(this, stringBuffer, ((Object[]) obj).length);
                    }
                } else if (z) {
                    C0023.m4574(this, stringBuffer, str, obj);
                } else {
                    C0051.m8251(stringBuffer, C0031.m5625(this));
                    C0051.m8251(stringBuffer, C0018.m3913(C0047.m7777(obj)));
                    C0051.m8251(stringBuffer, C0045.m7600(this));
                }
            } else if (z) {
                C0007.m1878(this, stringBuffer, (Map) obj);
            } else {
                iM6428 = C0038.m6428((Map) obj);
                C0003.m1429(this, stringBuffer, iM6428);
            }
            C0042.m7171(obj);
        } catch (Throwable th) {
            C0042.m7171(obj);
            throw th;
        }
    }

    public final void h(StringBuffer stringBuffer, int i) {
        C0051.m8251(stringBuffer, C0055.m8705(this));
        C0027.m5046(stringBuffer, i);
        C0051.m8251(stringBuffer, C0058.m9128(this));
    }
}