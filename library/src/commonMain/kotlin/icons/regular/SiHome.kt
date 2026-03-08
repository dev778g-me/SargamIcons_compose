package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHome: ImageVector
    get() {
        if (_SiHome != null) {
            return _SiHome!!
        }
        _SiHome = ImageVector.Builder(
            name = "Regular.SiHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.6f, 22f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.588f)
                verticalLineTo(8.332f)
                curveToRelative(0f, -0.382f, 0.18f, -0.734f, 0.48f, -0.965f)
                lineToRelative(7.78f, -5.126f)
                arcToRelative(1.195f, 1.195f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, 0f)
                lineToRelative(7.82f, 5.126f)
                curveToRelative(0.3f, 0.231f, 0.48f, 0.583f, 0.48f, 0.965f)
                verticalLineToRelative(11.256f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.6f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.8f, 12f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
                close()
            }
        }.build()

        return _SiHome!!
    }

@Suppress("ObjectPropertyName")
private var _SiHome: ImageVector? = null
