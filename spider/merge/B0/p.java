package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f757short = {725, 728, 721, 708};
    public final /* synthetic */ int a;
    public final /* synthetic */ Youku b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Youku youku, Serializable serializable, int i) {
        this.a = i;
        this.b = youku;
        this.c = serializable;
    }

    /* renamed from: ۟ۦۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7535() {
        if (C0049.m8038() <= 0) {
            return f757short;
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (C0024.m4731(this)) {
            case 0:
                return C0065.m9794(C0003.m1354(this), (HashMap) ((Map) C0043.m7333(this)));
            default:
                Youku youkuM1354 = C0003.m1354(this);
                C0047.m7777(youkuM1354);
                HashMap map = new HashMap();
                C0053.m8424(map, C0056.m8911(m7535(), 0, 4, 673), (String) C0043.m7333(this));
                return C0047.m7803(youkuM1354, map, true);
        }
    }
}