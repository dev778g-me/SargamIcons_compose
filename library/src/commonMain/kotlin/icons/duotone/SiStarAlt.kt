package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiStarAlt: ImageVector
    get() {
        if (_SiStarAlt != null) {
            return _SiStarAlt!!
        }
        _SiStarAlt = ImageVector.Builder(
            name = "Duotone.SiStarAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(21.748f, 10.576f)
                lineToRelative(-5.304f, 4.293f)
                lineToRelative(1.894f, 6.187f)
                curveToRelative(0.127f, 0.253f, 0f, 0.632f, -0.252f, 0.758f)
                curveToRelative(-0.127f, 0.126f, -0.253f, 0.126f, -0.38f, 0.126f)
                curveToRelative(-0.125f, 0f, -0.252f, 0f, -0.378f, -0.126f)
                lineToRelative(-5.177f, -3.788f)
                lineToRelative(-5.303f, 3.788f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.758f, 0f)
                curveToRelative(-0.252f, -0.126f, -0.379f, -0.505f, -0.252f, -0.758f)
                lineToRelative(1.641f, -6.313f)
                lineToRelative(-5.177f, -4.167f)
                curveToRelative(-0.252f, -0.126f, -0.379f, -0.505f, -0.252f, -0.757f)
                curveToRelative(0.126f, -0.253f, 0.378f, -0.506f, 0.63f, -0.506f)
                horizontalLineToRelative(6.693f)
                lineToRelative(2.02f, -5.808f)
                curveToRelative(0.127f, -0.252f, 0.38f, -0.505f, 0.632f, -0.505f)
                reflectiveCurveToRelative(0.505f, 0.253f, 0.631f, 0.505f)
                lineToRelative(2.147f, 5.808f)
                horizontalLineToRelative(6.566f)
                curveToRelative(0.252f, 0f, 0.505f, 0.253f, 0.631f, 0.506f)
                curveToRelative(0f, 0.252f, -0.126f, 0.505f, -0.253f, 0.757f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(21.748f, 10.576f)
                lineToRelative(-5.304f, 4.293f)
                lineToRelative(1.894f, 6.187f)
                curveToRelative(0.127f, 0.253f, 0f, 0.632f, -0.252f, 0.758f)
                curveToRelative(-0.127f, 0.126f, -0.253f, 0.126f, -0.38f, 0.126f)
                curveToRelative(-0.125f, 0f, -0.252f, 0f, -0.378f, -0.126f)
                lineToRelative(-5.177f, -3.788f)
                lineToRelative(-5.303f, 3.788f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.758f, 0f)
                curveToRelative(-0.252f, -0.126f, -0.379f, -0.505f, -0.252f, -0.758f)
                lineToRelative(1.641f, -6.313f)
                lineToRelative(-5.177f, -4.167f)
                curveToRelative(-0.252f, -0.126f, -0.379f, -0.505f, -0.252f, -0.757f)
                curveToRelative(0.126f, -0.253f, 0.378f, -0.506f, 0.63f, -0.506f)
                horizontalLineToRelative(6.693f)
                lineToRelative(2.02f, -5.808f)
                curveToRelative(0.127f, -0.252f, 0.38f, -0.505f, 0.632f, -0.505f)
                reflectiveCurveToRelative(0.505f, 0.253f, 0.631f, 0.505f)
                lineToRelative(2.147f, 5.808f)
                horizontalLineToRelative(6.566f)
                curveToRelative(0.252f, 0f, 0.505f, 0.253f, 0.631f, 0.506f)
                curveToRelative(0f, 0.252f, -0.126f, 0.505f, -0.253f, 0.757f)
                close()
            }
        }.build()

        return _SiStarAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiStarAlt: ImageVector? = null
