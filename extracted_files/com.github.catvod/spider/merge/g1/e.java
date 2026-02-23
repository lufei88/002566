package com.github.catvod.spider.merge.g1;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class e implements com.github.catvod.spider.merge.e1.a {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // com.github.catvod.spider.merge.e1.a
    public final synchronized com.github.catvod.spider.merge.e1.b a(String str) {
        d dVar;
        dVar = (d) C0030.m5374(C0011.m2758(this), str);
        if (dVar == null) {
            dVar = new d(str, C0015.m3408(this), C0031.m5605(this));
            C0023.m4551(C0011.m2758(this), str, dVar);
        }
        return dVar;
    }
}