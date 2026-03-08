package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMoney: ImageVector
    get() {
        if (_SiMoney != null) {
            return _SiMoney!!
        }
        _SiMoney = ImageVector.Builder(
            name = "Filled.SiMoney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6.8f)
                lineTo(4f, 8f)
                lineTo(2.8f, 8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9.8f)
                verticalLineToRelative(8.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 20f)
                horizontalLineToRelative(16.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, -1.8f)
                lineTo(21f, 17f)
                horizontalLineToRelative(1.2f)
                curveToRelative(0.992f, 0f, 1.8f, -0.808f, 1.8f, -1.8f)
                lineTo(24f, 6.8f)
                curveToRelative(0f, -0.992f, -0.808f, -1.8f, -1.8f, -1.8f)
                lineTo(5.8f, 5f)
                curveTo(4.808f, 5f, 4f, 5.808f, 4f, 6.8f)
                moveTo(6f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13.2f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.8f)
                lineTo(21f, 15f)
                horizontalLineToRelative(1f)
                lineTo(22f, 7f)
                close()
                moveTo(9f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
            }
        }.build()

        return _SiMoney!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoney: ImageVector? = null
