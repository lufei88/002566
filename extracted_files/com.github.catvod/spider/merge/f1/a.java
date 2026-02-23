package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.io.Serializable;
import java.util.Queue;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.merge.e1.b, Serializable {
    public final String a;
    public final d b;
    public final Queue c;

    public a(d dVar, Queue queue) {
        this.b = dVar;
        this.a = C0005.m1590(dVar);
        this.c = queue;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean c() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean d() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final boolean e() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final void f(String str, Exception exc) {
        c cVar = new c();
        C0009.m2099();
        cVar.a = 3;
        cVar.b = C0001.m1136(this);
        C0037.m6348(C0031.m5631());
        C0018.m3940(C0038.m6423(this), cVar);
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final /* synthetic */ boolean g(int i) {
        return C0041.m6751(this, i);
    }

    @Override // com.github.catvod.spider.merge.e1.b
    public final String getName() {
        return C0021.m4324(this);
    }
}