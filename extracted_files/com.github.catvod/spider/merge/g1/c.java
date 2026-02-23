package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f799short = {1440, 1468, 1442, 1468, 1451, 1451};
    public final /* synthetic */ int a;
    public final com.github.catvod.spider.merge.e1.a b;

    public c(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new e();
                new ConcurrentHashMap();
                new C0302e();
                break;
            default:
                this.b = new C0302e(false);
                new ConcurrentHashMap();
                break;
        }
    }

    /* renamed from: ۟ۥ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m8530() {
        if (C0004.m1557() <= 0) {
            return f799short;
        }
        return null;
    }

    public final com.github.catvod.spider.merge.e1.a a() {
        switch (C0042.m7188(this)) {
            case 0:
                return (C0302e) C0045.m7627(this);
            default:
                return (e) C0045.m7627(this);
        }
    }

    public final String b() {
        switch (C0042.m7188(this)) {
            case 0:
                return C0064.m9599(m8530(), 0, 6, 1426);
            default:
                throw new UnsupportedOperationException();
        }
    }
}