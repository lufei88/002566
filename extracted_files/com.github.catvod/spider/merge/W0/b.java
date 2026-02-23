package com.github.catvod.spider.merge.w0;

import android.view.ViewParent;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements InterfaceC0416b, Serializable {
    private final boolean isTopLevel;
    protected final Object receiver;
    private transient InterfaceC0416b reflected;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f864short = {899, 897, 912, 948, 901, 918, 897, 906, 912, 896, 898, 915, 951, 902, 917, 898, 905, 915, 975, 974, 939, 902, 905, 899, 917, 904, 910, 899, 968, 913, 910, 898, 912, 968, 945, 910, 898, 912, 951, 902, 917, 898, 905, 915, 988};
    public static final Object NO_RECEIVER = C0048.m7963();
    private final Class owner = ViewParent.class;
    private final String name = C0045.m7657(m9470(), 0, 9, 996);
    private final String signature = C0015.m3484(m9470(), 9, 36, 999);

    public b(Object obj, boolean z) {
        this.receiver = obj;
        this.isTopLevel = z;
    }

    /* renamed from: ۟ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m9468(Object obj) {
        if (C0044.m7508() < 0) {
            return ((b) obj).name;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static Class m9469(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((b) obj).owner;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m9470() {
        if (C0062.m9429() >= 0) {
            return f864short;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m9471(Object obj) {
        if (C0007.m1886() > 0) {
            return ((b) obj).receiver;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9472(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((b) obj).isTopLevel;
        }
        return false;
    }

    /* renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0416b m9473(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((b) obj).reflected;
        }
        return null;
    }

    /* renamed from: ۣۧۥۦ, reason: not valid java name and contains not printable characters */
    public static String m9474(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((b) obj).signature;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public Object call(Object... objArr) {
        return C0029.m5288(C0022.m4404(this), objArr);
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public Object callBy(Map map) {
        return C0045.m7587(C0022.m4404(this), map);
    }

    public InterfaceC0416b compute() {
        InterfaceC0416b interfaceC0416bM9473 = m9473(this);
        if (interfaceC0416bM9473 != null) {
            return interfaceC0416bM9473;
        }
        InterfaceC0416b interfaceC0416bM4928 = C0026.m4928(this);
        this.reflected = interfaceC0416bM4928;
        return interfaceC0416bM4928;
    }

    public abstract InterfaceC0416b computeReflected();

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0415a
    public List<Annotation> getAnnotations() {
        return C0005.m1625(C0022.m4404(this));
    }

    public Object getBoundReceiver() {
        return m9471(this);
    }

    public String getName() {
        return m9468(this);
    }

    public com.github.catvod.spider.merge.y0.d getOwner() {
        com.github.catvod.spider.merge.y0.d dVar;
        Class clsM9469 = m9469(this);
        if (clsM9469 == null) {
            return null;
        }
        if (m9472(this)) {
            C0047.m7777(C0041.m6755());
            dVar = new i(clsM9469);
        } else {
            C0047.m7777(C0041.m6755());
            dVar = new d(clsM9469);
        }
        return dVar;
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public List<Object> getParameters() {
        return C0006.m1793(C0022.m4404(this));
    }

    public abstract InterfaceC0416b getReflected();

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public com.github.catvod.spider.merge.y0.f getReturnType() {
        C0003.m1395(C0022.m4404(this));
        return null;
    }

    public String getSignature() {
        return m9474(this);
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public List<Object> getTypeParameters() {
        return C0027.m5092(C0022.m4404(this));
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public com.github.catvod.spider.merge.y0.g getVisibility() {
        return C0017.m3706(C0022.m4404(this));
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public boolean isAbstract() {
        return C0030.m5338(C0022.m4404(this));
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public boolean isFinal() {
        return C0052.m8382(C0022.m4404(this));
    }

    @Override // com.github.catvod.spider.merge.y0.InterfaceC0416b
    public boolean isOpen() {
        return C0018.m3886(C0022.m4404(this));
    }
}