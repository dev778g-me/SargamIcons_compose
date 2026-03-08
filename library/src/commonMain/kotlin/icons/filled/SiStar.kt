package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiStar: ImageVector
    get() {
        if (_SiStar != null) {
            return _SiStar!!
        }
        _SiStar = ImageVector.Builder(
            name = "Filled.SiStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.954f, 1.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.908f, -0.001f)
                lineToRelative(-2.184f, 6.92f)
                lineToRelative(-6.861f, -0.005f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.566f, 1.826f)
                lineToRelative(5.498f, 3.762f)
                lineToRelative(-2.067f, 6.545f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 21.86f)
                lineTo(12f, 17.854f)
                lineToRelative(5.594f, 4.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.536f, -1.114f)
                lineToRelative(-2.067f, -6.545f)
                lineToRelative(5.502f, -3.762f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.566f, -1.826f)
                lineToRelative(-6.866f, 0.005f)
                close()
            }
        }.build()

        return _SiStar!!
    }

@Suppress("ObjectPropertyName")
private var _SiStar: ImageVector? = null
