package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiThumbUpAlt2: ImageVector
    get() {
        if (_SiThumbUpAlt2 != null) {
            return _SiThumbUpAlt2!!
        }
        _SiThumbUpAlt2 = ImageVector.Builder(
            name = "Duotone.SiThumbUpAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(7f, 20f)
                horizontalLineToRelative(11.025f)
                curveToRelative(0.357f, 0f, 0.704f, -0.118f, 0.99f, -0.337f)
                reflectiveCurveToRelative(0.499f, -0.527f, 0.604f, -0.88f)
                lineToRelative(2.307f, -7.756f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.252f, -1.53f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, -0.515f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.185f)
                horizontalLineToRelative(-5.833f)
                verticalLineTo(5.349f)
                curveToRelative(0f, -2.045f, -1.043f, -3.01f, -2.304f, -3.326f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.712f, 0.164f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.234f, 0.302f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.084f, 0.378f)
                verticalLineTo(6.21f)
                lineTo(7f, 11.382f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 20f)
                horizontalLineToRelative(11.025f)
                curveToRelative(0.357f, 0f, 0.704f, -0.118f, 0.99f, -0.337f)
                reflectiveCurveToRelative(0.499f, -0.527f, 0.604f, -0.88f)
                lineToRelative(2.307f, -7.756f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.252f, -1.53f)
                arcToRelative(1.7f, 1.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.59f, -0.515f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.185f)
                horizontalLineToRelative(-5.833f)
                verticalLineTo(5.349f)
                curveToRelative(0f, -2.045f, -1.043f, -3.01f, -2.304f, -3.326f)
                arcToRelative(0.81f, 0.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.712f, 0.164f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.234f, 0.302f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.084f, 0.378f)
                verticalLineTo(6.21f)
                lineTo(7f, 11.382f)
                moveTo(2.8f, 9f)
                horizontalLineToRelative(3.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineToRelative(10.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.8f)
                horizontalLineTo(2.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                verticalLineTo(9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
                close()
            }
        }.build()

        return _SiThumbUpAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiThumbUpAlt2: ImageVector? = null
