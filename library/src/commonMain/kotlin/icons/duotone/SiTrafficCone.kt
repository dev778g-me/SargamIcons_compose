package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiTrafficCone: ImageVector
    get() {
        if (_SiTrafficCone != null) {
            return _SiTrafficCone!!
        }
        _SiTrafficCone = ImageVector.Builder(
            name = "Duotone.SiTrafficCone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(5f, 21f)
                lineTo(9.84f, 3.59f)
                curveToRelative(0.1f, -0.35f, 0.41f, -0.59f, 0.77f, -0.59f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.36f, 0f, 0.67f, 0.24f, 0.77f, 0.59f)
                lineTo(19f, 21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                lineTo(9.84f, 3.59f)
                curveToRelative(0.1f, -0.35f, 0.41f, -0.59f, 0.77f, -0.59f)
                horizontalLineToRelative(2.78f)
                curveToRelative(0.36f, 0f, 0.67f, 0.24f, 0.77f, 0.59f)
                lineTo(19f, 21f)
                moveTo(15.64f, 9.67f)
                curveToRelative(-1.18f, 0.22f, -2.4f, 0.33f, -3.64f, 0.33f)
                curveToRelative(-1.32f, 0f, -2.6f, -0.13f, -3.85f, -0.37f)
                moveToRelative(9.09f, 5.84f)
                curveToRelative(-1.69f, 0.35f, -3.44f, 0.53f, -5.24f, 0.53f)
                reflectiveCurveToRelative(-3.63f, -0.19f, -5.36f, -0.55f)
                moveTo(2f, 21f)
                horizontalLineToRelative(20f)
            }
        }.build()

        return _SiTrafficCone!!
    }

@Suppress("ObjectPropertyName")
private var _SiTrafficCone: ImageVector? = null
