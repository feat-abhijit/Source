package androidx.lifecycle;

import f.i.a.f.f.o.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import u.j.h.a.d;
import u.j.h.a.h;
import u.m.c.j;

@d(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* compiled from: CoroutineLiveData.kt */
public final class EmittedSource$disposeNow$2 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int label;
    private CoroutineScope p$;
    public final /* synthetic */ EmittedSource this$0;

    public EmittedSource$disposeNow$2(EmittedSource emittedSource, Continuation continuation) {
        this.this$0 = emittedSource;
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        j.checkParameterIsNotNull(continuation, "completion");
        EmittedSource$disposeNow$2 emittedSource$disposeNow$2 = new EmittedSource$disposeNow$2(this.this$0, continuation);
        emittedSource$disposeNow$2.p$ = (CoroutineScope) obj;
        return emittedSource$disposeNow$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((EmittedSource$disposeNow$2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            g.throwOnFailure(obj);
            this.this$0.removeSource();
            return Unit.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
