package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f504short = {775, 769, 895, 787, 769, 785, 795, 795, 716, 717, 735, 692};
    public int d;
    public n a = C0023.m4615();
    public Charset b = C0025.m4807();
    public final ThreadLocal c = new ThreadLocal();
    public final boolean e = true;
    public final int f = 1;
    public final int g = 30;
    public final int h = 1;

    /* renamed from: ۟ۢۦۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5318() {
        if (C0051.m8216() <= 0) {
            return f504short;
        }
        return null;
    }

    public final g a() {
        try {
            g gVar = (g) super.clone();
            String strM6425 = C0038.m6425(C0065.m9795(this));
            C0047.m7777(gVar);
            gVar.b = C0055.m8706(strM6425);
            gVar.a = C0027.m5044(C0033.m5850(C0009.m2128(this)));
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final CharsetEncoder b() {
        CharsetEncoder charsetEncoderM5383 = C0030.m5383(C0065.m9795(this));
        C0042.m7194(C0036.m6207(this), charsetEncoderM5383);
        String strM6425 = C0038.m6425(C0033.m5794(charsetEncoderM5383));
        this.d = C0007.m1815(strM6425, C0047.m7833(m5318(), 0, 8, 850)) ? 1 : C0043.m7277(strM6425, C0049.m8007(m5318(), 8, 4, 665)) ? 2 : 3;
        return charsetEncoderM5383;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return C0045.m7654(this);
    }
}