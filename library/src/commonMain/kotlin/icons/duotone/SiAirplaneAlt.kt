package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiAirplaneAlt: ImageVector
    get() {
        if (_SiAirplaneAlt != null) {
            return _SiAirplaneAlt!!
        }
        _SiAirplaneAlt = ImageVector.Builder(
            name = "Duotone.SiAirplaneAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(15.296f, 6.291f)
                curveToRelative(2.46f, -2.46f, 3.866f, -3.266f, 4.766f, -2.366f)
                reflectiveCurveToRelative(0.101f, 2.315f, -2.358f, 4.774f)
                lineToRelative(-1.2f, 1.2f)
                lineToRelative(1.614f, 7.208f)
                curveToRelative(0.085f, 0.516f, -0.165f, 0.972f, -0.532f, 1.313f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.766f, -6.472f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.632f, -0.143f)
                lineToRelative(-3.576f, 3.146f)
                lineToRelative(0.727f, 2.633f)
                curveToRelative(0.058f, 0.243f, -0.036f, 0.517f, -0.22f, 0.701f)
                lineToRelative(-1.298f, 0.855f)
                lineToRelative(-1.657f, -3.317f)
                lineToRelative(-3.31f, -1.65f)
                lineToRelative(0.855f, -1.297f)
                curveToRelative(0.185f, -0.184f, 0.46f, -0.278f, 0.701f, -0.22f)
                lineToRelative(2.634f, 0.727f)
                lineToRelative(3.146f, -3.576f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.143f, -0.632f)
                lineTo(4.16f, 7.823f)
                lineToRelative(1.414f, -1.415f)
                curveToRelative(0.34f, -0.366f, 0.797f, -0.617f, 1.312f, -0.532f)
                lineToRelative(7.21f, 1.614f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.296f, 6.291f)
                curveToRelative(2.46f, -2.46f, 3.866f, -3.266f, 4.766f, -2.366f)
                reflectiveCurveToRelative(0.101f, 2.315f, -2.358f, 4.774f)
                lineToRelative(-1.2f, 1.2f)
                lineToRelative(1.614f, 7.208f)
                curveToRelative(0.085f, 0.516f, -0.165f, 0.972f, -0.532f, 1.313f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.766f, -6.472f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.632f, -0.143f)
                lineToRelative(-3.576f, 3.146f)
                lineToRelative(0.727f, 2.633f)
                curveToRelative(0.058f, 0.243f, -0.036f, 0.517f, -0.22f, 0.702f)
                lineToRelative(-1.298f, 0.854f)
                lineToRelative(-1.657f, -3.317f)
                lineToRelative(-3.31f, -1.65f)
                lineToRelative(0.855f, -1.296f)
                curveToRelative(0.185f, -0.185f, 0.46f, -0.28f, 0.701f, -0.222f)
                lineToRelative(2.634f, 0.728f)
                lineToRelative(3.146f, -3.576f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.143f, -0.632f)
                lineTo(4.16f, 7.823f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(0.34f, -0.367f, 0.797f, -0.618f, 1.312f, -0.533f)
                lineToRelative(7.21f, 1.614f)
                close()
            }
        }.build()

        return _SiAirplaneAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiAirplaneAlt: ImageVector? = null
