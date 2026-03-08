package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoney: ImageVector
    get() {
        if (_SiMoney != null) {
            return _SiMoney!!
        }
        _SiMoney = ImageVector.Builder(
            name = "Regular.SiMoney",
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
                moveTo(5f, 9f)
                lineTo(5f, 6.8f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(16.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineToRelative(8.4f)
                curveToRelative(0f, 0.44f, -0.36f, 0.8f, -0.8f, 0.8f)
                lineTo(20f, 16f)
                moveTo(2.8f, 9f)
                horizontalLineToRelative(16.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineToRelative(8.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, 0.8f)
                lineTo(2.8f, 19f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.8f, -0.8f)
                lineTo(2f, 9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
                close()
                moveTo(12f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
        }.build()

        return _SiMoney!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoney: ImageVector? = null
