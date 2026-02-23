package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class i {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f408short = {2961};

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    /* renamed from: ۟ۥۡۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3824() {
        if (C0022.m4497() > 0) {
            return f408short;
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3825(Object obj) {
        if (C0043.m7332() > 0) {
            return ((i) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m3826(Object obj) {
        if (C0036.m6252() > 0) {
            return ((i) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3827(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((i) obj).b;
        }
        return null;
    }

    public final void a() {
        String strM1840 = C0007.m1840();
        this.c = strM1840;
        this.b = strM1840;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        boolean zM7327 = C0043.m7327(m3825(this));
        String strM1840 = C0007.m1840();
        C0018.m3933(sb, zM7327 ? strM1840 : m3825(this));
        C0018.m3933(sb, C0019.m4107(m3824(), 0, 1, 2993));
        if (!C0043.m7327(m3827(this))) {
            strM1840 = m3827(this);
        }
        C0018.m3933(sb, strM1840);
        return C0047.m7763(sb);
    }

    public final String c() {
        return C0043.m7327(m3826(this)) ? C0007.m1840() : m3826(this);
    }
}