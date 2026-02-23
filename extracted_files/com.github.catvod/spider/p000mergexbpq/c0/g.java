package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f184short = {1125, 1123, 1053, 1137, 1123, 1139, 1145, 1145, 3134, 3135, 3117, 3142};
    int f;
    private m c = C0038.m6465();
    private Charset d = C0032.m5763();
    private final ThreadLocal<CharsetEncoder> e = new ThreadLocal<>();
    private boolean g = true;
    private int h = 1;
    private int i = 1;

    /* renamed from: ۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static m m2181(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((g) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۧۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2182(Object obj) {
        if (C0050.m8121() < 0) {
            return ((g) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۥ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2183(Object obj) {
        if (C0023.m4566() < 0) {
            return ((g) obj).i;
        }
        return 0;
    }

    /* renamed from: ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static ThreadLocal m2184(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((g) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2185() {
        if (C0059.m9257() < 0) {
            return f184short;
        }
        return null;
    }

    /* renamed from: ۧۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m2186(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((g) obj).h;
        }
        return 0;
    }

    /* renamed from: ۧۨۦۦ, reason: not valid java name and contains not printable characters */
    public static Charset m2187(Object obj) {
        if (C0054.m8557() < 0) {
            return ((g) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۨۨۤ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m2188(Object obj) {
        if (C0016.m3596() < 0) {
            return ((g) obj).e();
        }
        return null;
    }

    public final g a() {
        try {
            g gVar = (g) super.clone();
            String strM6425 = C0038.m6425(m2187(this));
            C0047.m7777(gVar);
            gVar.d = C0055.m8706(strM6425);
            gVar.c = C0054.m8619(C0033.m5850(m2181(this)));
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    final CharsetEncoder b() {
        CharsetEncoder charsetEncoder = (CharsetEncoder) C0017.m3710(m2184(this));
        return charsetEncoder != null ? charsetEncoder : m2188(this);
    }

    public final m c() {
        return m2181(this);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return C0031.m5635(this);
    }

    public final int d() {
        return m2186(this);
    }

    final CharsetEncoder e() {
        CharsetEncoder charsetEncoderM5383 = C0030.m5383(m2187(this));
        C0042.m7194(m2184(this), charsetEncoderM5383);
        String strM6425 = C0038.m6425(C0033.m5794(charsetEncoderM5383));
        this.f = C0007.m1815(strM6425, C0028.m5109(m2185(), 0, 8, 1072)) ? 1 : C0043.m7277(strM6425, C0055.m8814(m2185(), 8, 4, 3179)) ? 2 : 3;
        return charsetEncoderM5383;
    }

    public final boolean f() {
        return m2182(this);
    }

    public final int g() {
        return m2183(this);
    }
}