package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiTableRows: ImageVector
    get() {
        if (_SiTableRows != null) {
            return _SiTableRows!!
        }
        _SiTableRows = ImageVector.Builder(
            name = "Filled.SiTableRows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.4f, 3f)
                horizontalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(5.4f, 21f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.6f)
                lineTo(3f, 5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                lineTo(4f, 10f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                lineTo(4f, 16f)
                close()
            }
        }.build()

        return _SiTableRows!!
    }

@Suppress("ObjectPropertyName")
private var _SiTableRows: ImageVector? = null
