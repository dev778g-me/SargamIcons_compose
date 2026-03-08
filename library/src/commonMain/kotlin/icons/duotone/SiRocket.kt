package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiRocket: ImageVector
    get() {
        if (_SiRocket != null) {
            return _SiRocket!!
        }
        _SiRocket = ImageVector.Builder(
            name = "Duotone.SiRocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(9.198f, 6.59f)
                curveToRelative(0f, -2.336f, 1.563f, -4.549f, 2.805f, -4.59f)
                curveToRelative(1.242f, 0.041f, 2.802f, 2.254f, 2.802f, 4.59f)
                verticalLineToRelative(1.148f)
                curveToRelative(0f, 2.54f, 3.346f, 4.221f, 4.187f, 5.328f)
                curveToRelative(0.378f, 0.475f, 0.372f, 1.913f, 0.401f, 2.541f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.39f, 0.393f)
                horizontalLineToRelative(-3.906f)
                lineToRelative(-0.684f, 0.819f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.337f, 0.181f)
                horizontalLineTo(9.927f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.337f, -0.181f)
                lineTo(8.906f, 16f)
                horizontalLineTo(5f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.39f, -0.393f)
                curveToRelative(0.029f, -0.628f, 0.023f, -2.066f, 0.4f, -2.541f)
                curveToRelative(0.842f, -1.107f, 4.188f, -2.787f, 4.188f, -5.328f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                reflectiveCurveToRelative(1f, -1.425f, 1f, -2.137f)
                curveToRelative(0f, -0.713f, -0.533f, -0.863f, -1f, -0.863f)
                reflectiveCurveToRelative(-1f, 0.15f, -1f, 0.863f)
                curveTo(11f, 20.575f, 12f, 22f, 12f, 22f)
                close()
                moveTo(9.198f, 6.59f)
                curveToRelative(0f, -2.336f, 1.563f, -4.549f, 2.805f, -4.59f)
                curveToRelative(1.242f, 0.041f, 2.802f, 2.254f, 2.802f, 4.59f)
                verticalLineToRelative(1.148f)
                curveToRelative(0f, 2.54f, 3.346f, 4.221f, 4.187f, 5.328f)
                curveToRelative(0.378f, 0.475f, 0.372f, 1.913f, 0.401f, 2.541f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.39f, 0.393f)
                horizontalLineToRelative(-3.906f)
                lineToRelative(-0.684f, 0.819f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.337f, 0.181f)
                horizontalLineTo(9.927f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.337f, -0.181f)
                lineTo(8.906f, 16f)
                horizontalLineTo(5f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.39f, -0.393f)
                curveToRelative(0.029f, -0.628f, 0.023f, -2.066f, 0.4f, -2.541f)
                curveToRelative(0.842f, -1.107f, 4.188f, -2.787f, 4.188f, -5.328f)
                close()
            }
        }.build()

        return _SiRocket!!
    }

@Suppress("ObjectPropertyName")
private var _SiRocket: ImageVector? = null
